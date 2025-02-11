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
import com.danglit.avacloud.client.models.PostAvaProjectValidationSourceOptions;
import com.danglit.avacloud.client.models.ValidationResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidationApi
 */
@Ignore
public class ValidationApiTest {

    private final ValidationApi api = new ValidationApi();

    
    /**
     * This endpoint validates AVA files, typically GAEB or ÖNorm. The type of file needs to be provided as a query parameter, since there is no auto detection of the uploaded file type.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void validationValidateFileTest() throws Exception {
        File avaFile = null;
        String fileValidationSourceType = null;
        ValidationResult response = api.validationValidateFile(avaFile, fileValidationSourceType);

        // TODO: test validations
    }
    
    /**
     * This endpoint provides a full validation of a provided ProjectDto. It will take the given exchange phase into account and do some general project validation. Optionally, a conversion to a desired target can also be done, in which case the target file will also be validated.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void validationValidateProjectTest() throws Exception {
        PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions = null;
        ValidationResult response = api.validationValidateProject(avaProjectValidationSourceOptions);

        // TODO: test validations
    }
    
}
