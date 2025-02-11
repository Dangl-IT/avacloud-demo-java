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

import com.danglit.avacloud.client.invoker.ApiCallback;
import com.danglit.avacloud.client.invoker.ApiClient;
import com.danglit.avacloud.client.invoker.ApiException;
import com.danglit.avacloud.client.invoker.ApiResponse;
import com.danglit.avacloud.client.invoker.Configuration;
import com.danglit.avacloud.client.invoker.Pair;
import com.danglit.avacloud.client.invoker.ProgressRequestBody;
import com.danglit.avacloud.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.danglit.avacloud.client.models.ApiError;
import java.io.File;
import com.danglit.avacloud.client.models.PostAvaProjectValidationSourceOptions;
import com.danglit.avacloud.client.models.ValidationResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ValidationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ValidationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for validationValidateFile
     * @param avaFile The file to validate (optional)
     * @param fileValidationSourceType You need to indicate which type of file is being provided, there is no auto detection mechanism (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validationValidateFileCall(File avaFile, String fileValidationSourceType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/validation/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fileValidationSourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fileValidationSourceType", fileValidationSourceType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (avaFile != null)
        localVarFormParams.put("avaFile", avaFile);

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Dangl.Identity" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call validationValidateFileValidateBeforeCall(File avaFile, String fileValidationSourceType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = validationValidateFileCall(avaFile, fileValidationSourceType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This endpoint validates AVA files, typically GAEB or ÖNorm. The type of file needs to be provided as a query parameter, since there is no auto detection of the uploaded file type.
     * 
     * @param avaFile The file to validate (optional)
     * @param fileValidationSourceType You need to indicate which type of file is being provided, there is no auto detection mechanism (optional)
     * @return ValidationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidationResult validationValidateFile(File avaFile, String fileValidationSourceType) throws ApiException {
        ApiResponse<ValidationResult> resp = validationValidateFileWithHttpInfo(avaFile, fileValidationSourceType);
        return resp.getData();
    }

    /**
     * This endpoint validates AVA files, typically GAEB or ÖNorm. The type of file needs to be provided as a query parameter, since there is no auto detection of the uploaded file type.
     * 
     * @param avaFile The file to validate (optional)
     * @param fileValidationSourceType You need to indicate which type of file is being provided, there is no auto detection mechanism (optional)
     * @return ApiResponse&lt;ValidationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidationResult> validationValidateFileWithHttpInfo(File avaFile, String fileValidationSourceType) throws ApiException {
        com.squareup.okhttp.Call call = validationValidateFileValidateBeforeCall(avaFile, fileValidationSourceType, null, null);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This endpoint validates AVA files, typically GAEB or ÖNorm. The type of file needs to be provided as a query parameter, since there is no auto detection of the uploaded file type. (asynchronously)
     * 
     * @param avaFile The file to validate (optional)
     * @param fileValidationSourceType You need to indicate which type of file is being provided, there is no auto detection mechanism (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validationValidateFileAsync(File avaFile, String fileValidationSourceType, final ApiCallback<ValidationResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = validationValidateFileValidateBeforeCall(avaFile, fileValidationSourceType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validationValidateProject
     * @param avaProjectValidationSourceOptions The options used for the validation operation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validationValidateProjectCall(PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = avaProjectValidationSourceOptions;

        // create path and map variables
        String localVarPath = "/validation/project";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Dangl.Identity" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call validationValidateProjectValidateBeforeCall(PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'avaProjectValidationSourceOptions' is set
        if (avaProjectValidationSourceOptions == null) {
            throw new ApiException("Missing the required parameter 'avaProjectValidationSourceOptions' when calling validationValidateProject(Async)");
        }
        

        com.squareup.okhttp.Call call = validationValidateProjectCall(avaProjectValidationSourceOptions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This endpoint provides a full validation of a provided ProjectDto. It will take the given exchange phase into account and do some general project validation. Optionally, a conversion to a desired target can also be done, in which case the target file will also be validated.
     * 
     * @param avaProjectValidationSourceOptions The options used for the validation operation (required)
     * @return ValidationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidationResult validationValidateProject(PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions) throws ApiException {
        ApiResponse<ValidationResult> resp = validationValidateProjectWithHttpInfo(avaProjectValidationSourceOptions);
        return resp.getData();
    }

    /**
     * This endpoint provides a full validation of a provided ProjectDto. It will take the given exchange phase into account and do some general project validation. Optionally, a conversion to a desired target can also be done, in which case the target file will also be validated.
     * 
     * @param avaProjectValidationSourceOptions The options used for the validation operation (required)
     * @return ApiResponse&lt;ValidationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidationResult> validationValidateProjectWithHttpInfo(PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions) throws ApiException {
        com.squareup.okhttp.Call call = validationValidateProjectValidateBeforeCall(avaProjectValidationSourceOptions, null, null);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This endpoint provides a full validation of a provided ProjectDto. It will take the given exchange phase into account and do some general project validation. Optionally, a conversion to a desired target can also be done, in which case the target file will also be validated. (asynchronously)
     * 
     * @param avaProjectValidationSourceOptions The options used for the validation operation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validationValidateProjectAsync(PostAvaProjectValidationSourceOptions avaProjectValidationSourceOptions, final ApiCallback<ValidationResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = validationValidateProjectValidateBeforeCall(avaProjectValidationSourceOptions, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
