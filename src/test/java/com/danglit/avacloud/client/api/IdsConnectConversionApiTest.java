/*
 * AVACloud API 1.55.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.55.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.api;

import com.danglit.avacloud.client.models.ApiError;
import java.io.File;
import com.danglit.avacloud.client.models.FlatAvaProject;
import com.danglit.avacloud.client.models.ProjectDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdsConnectConversionApi
 */
@Ignore
public class IdsConnectConversionApiTest {

    private final IdsConnectConversionApi api = new IdsConnectConversionApi();

    
    /**
     * Converts IDS Connect files to Dangl.AVA projects
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void idsConnectConversionConvertToAvaTest() throws Exception {
        File idsConnectFile = null;
        Boolean removePlainTextLongTexts = null;
        Boolean removeHtmlLongTexts = null;
        ProjectDto response = api.idsConnectConversionConvertToAva(idsConnectFile, removePlainTextLongTexts, removeHtmlLongTexts);

        // TODO: test validations
    }
    
    /**
     * Converts IDS Connect files to Dangl.AVA projects
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void idsConnectConversionConvertToFlatAvaTest() throws Exception {
        File idsConnectFile = null;
        FlatAvaProject response = api.idsConnectConversionConvertToFlatAva(idsConnectFile);

        // TODO: test validations
    }
    
}
