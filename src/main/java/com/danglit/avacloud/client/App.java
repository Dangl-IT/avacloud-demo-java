package com.danglit.avacloud.client;

import com.danglit.avacloud.client.invoker.*;
import com.danglit.avacloud.client.invoker.auth.*;
import com.danglit.avacloud.client.models.*;
import com.danglit.avacloud.client.api.GaebConversionApi;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello AVACloud!");

        if (args.length != 3) {
            System.out.println("Arguments not as expected.");
            System.out.println("Please provide three arguments in the following order:");
            System.out.println("1. Dangl.Identity OAuth2 ClientId");
            System.out.println("2. Dangl.Identity OAuth2 ClientSecret");
            System.out.println("3. Path to a local GAEB file");
            return;
        }

        executeAvaCloudExample(args);
    }

    private static void executeAvaCloudExample(String[] args) {

        String clientId = args[0];
        String clientSecret = args[1];
        String gaebFilePath = args[2];

        String bearerToken;
        try {
            bearerToken = DanglIdentityUtils.getBearerToken(clientId, clientSecret);
        } catch (IOException e)  {
            System.out.println("IO Exception while obtaining access token:");
            System.out.println(e.toString());
            return;
        }

        // Configure OAuth2 access token for Dangl.Identity authorization
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth danglIdentity = (OAuth) defaultClient.getAuthentication("Dangl.Identity");
        danglIdentity.setAccessToken(bearerToken);

        File gaebInputFile = new File(gaebFilePath);
        try {
            transformGaebToExcel(gaebInputFile);
            printProjectTotalPriceAndPositionCount(gaebInputFile);
        } catch (ApiException e) {
            System.err.println("Exception in AVACloud example");
            e.printStackTrace();
        }
    }

    private static void transformGaebToExcel(File gaebFile) throws ApiException {
        GaebConversionApi gaebConversionApi = new GaebConversionApi();
        File excelConversionResult = gaebConversionApi.gaebConversionConvertToExcel(gaebFile, true, true, "de");
        String excelResultFilePath = gaebFile.getAbsolutePath() + ".xlsx";
        System.out.println("Saving Excel conversion result to:");
        System.out.println(excelResultFilePath);
        try {
            Files.copy(excelConversionResult.toPath(), Paths.get(excelResultFilePath).toAbsolutePath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("IO Exception while saving Excel file:");
            System.out.println(e.toString());
        }
    }

    private static void printProjectTotalPriceAndPositionCount(File gaebFile) throws ApiException {
        GaebConversionApi gaebConversionApi = new GaebConversionApi();
        ProjectDto project = gaebConversionApi.gaebConversionConvertToAva(gaebFile, true, true);
        BigDecimal totalPrice = getProjectTotalPrice(project);
        System.out.println("Project total price (net): " + totalPrice);
        Integer countOfPositions = getProjectPositionCount(project);
        System.out.println("Count of positions: " + countOfPositions);
        System.out.println("All positions in the project:");
        printPositionsInProject(project);
    }

    private static BigDecimal getProjectTotalPrice(ProjectDto project) {
        return project
            .getServiceSpecifications()
            .get(0)
            .getTotalPrice();
    } 

    private static Integer getProjectPositionCount(ProjectDto project) {
        ServiceSpecificationDto servSpec = project
            .getServiceSpecifications()
            .get(0);
        Integer positionsCount = getPositionsInElementList(servSpec.getElements());
        return positionsCount;
    }

    private static Integer getPositionsInElementList(List<IElementDto> elements) {
        Integer positionsCount = 0;
        for(IElementDto element: elements) {
            if (element instanceof PositionDto) {
                positionsCount++;
            } else if (element instanceof ServiceSpecificationGroupDto) {
                positionsCount += getPositionsInElementList(((ServiceSpecificationGroupDto)element).getElements());
            }
        }
        return positionsCount;
    }

    private static List<PositionDto> getPositions(List<IElementDto> elements) {
        List<PositionDto> positions = new ArrayList<PositionDto>();

        for(IElementDto element: elements) {
            if (element instanceof PositionDto) {
                positions.add((PositionDto)element);
            } else if (element instanceof ServiceSpecificationGroupDto) {
                List<PositionDto> subPositions = getPositions(((ServiceSpecificationGroupDto)element).getElements());
                positions.addAll(subPositions);
            }
        }

        return positions;
    }

    private static void printPositionsInProject(ProjectDto project) {
        ServiceSpecificationDto servSpec = project
            .getServiceSpecifications()
            .get(0);
        List<PositionDto> positions = getPositions(servSpec.getElements());

        for(PositionDto position: positions) {
            System.out.print(position.getItemNumber().getStringRepresentation());
            System.out.print(" - ");
            System.out.print(position.getShortText());
            System.out.print(" - ");
            System.out.print(position.getUnitTag());
            System.out.print(" - ");
            System.out.println(position.getUnitPrice());
        }
    }
}
