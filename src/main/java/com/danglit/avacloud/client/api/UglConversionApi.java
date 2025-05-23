/*
 * AVACloud API 1.59.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.59.0
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
import com.danglit.avacloud.client.models.FlatAvaProject;
import com.danglit.avacloud.client.models.ProjectDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UglConversionApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public UglConversionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UglConversionApi(ApiClient apiClient) {
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
     * Build call for uglConversionConvertToAva
     * @param uglFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uglConversionConvertToAvaCall(File uglFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversion/ugl/ava";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (removePlainTextLongTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("RemovePlainTextLongTexts", removePlainTextLongTexts));
        if (removeHtmlLongTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("RemoveHtmlLongTexts", removeHtmlLongTexts));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (uglFile != null)
        localVarFormParams.put("uglFile", uglFile);

        final String[] localVarAccepts = {
            "application/vnd.com.dangl-it.ProjectDto.v1+json", "application/problem+json"
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
    private com.squareup.okhttp.Call uglConversionConvertToAvaValidateBeforeCall(File uglFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = uglConversionConvertToAvaCall(uglFile, removePlainTextLongTexts, removeHtmlLongTexts, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts Ugl files to Dangl.AVA projects
     * 
     * @param uglFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @return ProjectDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProjectDto uglConversionConvertToAva(File uglFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts) throws ApiException {
        ApiResponse<ProjectDto> resp = uglConversionConvertToAvaWithHttpInfo(uglFile, removePlainTextLongTexts, removeHtmlLongTexts);
        return resp.getData();
    }

    /**
     * Converts Ugl files to Dangl.AVA projects
     * 
     * @param uglFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @return ApiResponse&lt;ProjectDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProjectDto> uglConversionConvertToAvaWithHttpInfo(File uglFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts) throws ApiException {
        com.squareup.okhttp.Call call = uglConversionConvertToAvaValidateBeforeCall(uglFile, removePlainTextLongTexts, removeHtmlLongTexts, null, null);
        Type localVarReturnType = new TypeToken<ProjectDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts Ugl files to Dangl.AVA projects (asynchronously)
     * 
     * @param uglFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uglConversionConvertToAvaAsync(File uglFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ApiCallback<ProjectDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uglConversionConvertToAvaValidateBeforeCall(uglFile, removePlainTextLongTexts, removeHtmlLongTexts, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProjectDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uglConversionConvertToFlatAva
     * @param uglFile The input file (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uglConversionConvertToFlatAvaCall(File uglFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversion/ugl/flat-ava";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (uglFile != null)
        localVarFormParams.put("uglFile", uglFile);

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
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
    private com.squareup.okhttp.Call uglConversionConvertToFlatAvaValidateBeforeCall(File uglFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = uglConversionConvertToFlatAvaCall(uglFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts Ugl files to Dangl.AVA projects
     * 
     * @param uglFile The input file (optional)
     * @return FlatAvaProject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FlatAvaProject uglConversionConvertToFlatAva(File uglFile) throws ApiException {
        ApiResponse<FlatAvaProject> resp = uglConversionConvertToFlatAvaWithHttpInfo(uglFile);
        return resp.getData();
    }

    /**
     * Converts Ugl files to Dangl.AVA projects
     * 
     * @param uglFile The input file (optional)
     * @return ApiResponse&lt;FlatAvaProject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FlatAvaProject> uglConversionConvertToFlatAvaWithHttpInfo(File uglFile) throws ApiException {
        com.squareup.okhttp.Call call = uglConversionConvertToFlatAvaValidateBeforeCall(uglFile, null, null);
        Type localVarReturnType = new TypeToken<FlatAvaProject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts Ugl files to Dangl.AVA projects (asynchronously)
     * 
     * @param uglFile The input file (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uglConversionConvertToFlatAvaAsync(File uglFile, final ApiCallback<FlatAvaProject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uglConversionConvertToFlatAvaValidateBeforeCall(uglFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FlatAvaProject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
