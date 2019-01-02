/*
 * AVACloud API 1.4.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.4.0
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
import com.danglit.avacloud.client.models.ProjectDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OenormConversionApi {
    private ApiClient apiClient;

    public OenormConversionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OenormConversionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oenormConversionConvertToAva
     * @param oenormFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToAvaCall(File oenormFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversion/oenorm/ava";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (removePlainTextLongTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("RemovePlainTextLongTexts", removePlainTextLongTexts));
        if (removeHtmlLongTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("RemoveHtmlLongTexts", removeHtmlLongTexts));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (oenormFile != null)
        localVarFormParams.put("oenormFile", oenormFile);

        final String[] localVarAccepts = {
            "application/vnd.com.dangl-it.ProjectDto.v1+json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oenormConversionConvertToAvaValidateBeforeCall(File oenormFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = oenormConversionConvertToAvaCall(oenormFile, removePlainTextLongTexts, removeHtmlLongTexts, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts ÖNorm files to Dangl.AVA projects
     * 
     * @param oenormFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @return ProjectDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProjectDto oenormConversionConvertToAva(File oenormFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts) throws ApiException {
        ApiResponse<ProjectDto> resp = oenormConversionConvertToAvaWithHttpInfo(oenormFile, removePlainTextLongTexts, removeHtmlLongTexts);
        return resp.getData();
    }

    /**
     * Converts ÖNorm files to Dangl.AVA projects
     * 
     * @param oenormFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @return ApiResponse&lt;ProjectDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProjectDto> oenormConversionConvertToAvaWithHttpInfo(File oenormFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts) throws ApiException {
        com.squareup.okhttp.Call call = oenormConversionConvertToAvaValidateBeforeCall(oenormFile, removePlainTextLongTexts, removeHtmlLongTexts, null, null);
        Type localVarReturnType = new TypeToken<ProjectDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts ÖNorm files to Dangl.AVA projects (asynchronously)
     * 
     * @param oenormFile The input file (optional)
     * @param removePlainTextLongTexts If set to true, plain text long texts will be removed from the output to reduce response sizes (optional)
     * @param removeHtmlLongTexts If set to true, html long texts will be removed from the output to reduce response sizes (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToAvaAsync(File oenormFile, Boolean removePlainTextLongTexts, Boolean removeHtmlLongTexts, final ApiCallback<ProjectDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oenormConversionConvertToAvaValidateBeforeCall(oenormFile, removePlainTextLongTexts, removeHtmlLongTexts, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProjectDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for oenormConversionConvertToExcel
     * @param oenormFile The input file (optional)
     * @param writePrices Defaults to true (optional)
     * @param writeLongTexts Defaults to true (optional)
     * @param conversionCulture The culture that should be used for the conversion process, to have localized Excel files (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToExcelCall(File oenormFile, Boolean writePrices, Boolean writeLongTexts, String conversionCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversion/oenorm/excel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (writePrices != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("WritePrices", writePrices));
        if (writeLongTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("WriteLongTexts", writeLongTexts));
        if (conversionCulture != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ConversionCulture", conversionCulture));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (oenormFile != null)
        localVarFormParams.put("oenormFile", oenormFile);

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oenormConversionConvertToExcelValidateBeforeCall(File oenormFile, Boolean writePrices, Boolean writeLongTexts, String conversionCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = oenormConversionConvertToExcelCall(oenormFile, writePrices, writeLongTexts, conversionCulture, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts ÖNorm files to Excel
     * 
     * @param oenormFile The input file (optional)
     * @param writePrices Defaults to true (optional)
     * @param writeLongTexts Defaults to true (optional)
     * @param conversionCulture The culture that should be used for the conversion process, to have localized Excel files (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File oenormConversionConvertToExcel(File oenormFile, Boolean writePrices, Boolean writeLongTexts, String conversionCulture) throws ApiException {
        ApiResponse<File> resp = oenormConversionConvertToExcelWithHttpInfo(oenormFile, writePrices, writeLongTexts, conversionCulture);
        return resp.getData();
    }

    /**
     * Converts ÖNorm files to Excel
     * 
     * @param oenormFile The input file (optional)
     * @param writePrices Defaults to true (optional)
     * @param writeLongTexts Defaults to true (optional)
     * @param conversionCulture The culture that should be used for the conversion process, to have localized Excel files (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> oenormConversionConvertToExcelWithHttpInfo(File oenormFile, Boolean writePrices, Boolean writeLongTexts, String conversionCulture) throws ApiException {
        com.squareup.okhttp.Call call = oenormConversionConvertToExcelValidateBeforeCall(oenormFile, writePrices, writeLongTexts, conversionCulture, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts ÖNorm files to Excel (asynchronously)
     * 
     * @param oenormFile The input file (optional)
     * @param writePrices Defaults to true (optional)
     * @param writeLongTexts Defaults to true (optional)
     * @param conversionCulture The culture that should be used for the conversion process, to have localized Excel files (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToExcelAsync(File oenormFile, Boolean writePrices, Boolean writeLongTexts, String conversionCulture, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oenormConversionConvertToExcelValidateBeforeCall(oenormFile, writePrices, writeLongTexts, conversionCulture, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for oenormConversionConvertToGaeb
     * @param oenormFile The input file (optional)
     * @param destinationGaebType Defaults to GAEB XML V3.2 (optional)
     * @param targetExchangePhaseTransform Defaults to none, meaning no transformation will be done (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToGaebCall(File oenormFile, String destinationGaebType, String targetExchangePhaseTransform, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversion/oenorm/gaeb";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (destinationGaebType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DestinationGaebType", destinationGaebType));
        if (targetExchangePhaseTransform != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("TargetExchangePhaseTransform", targetExchangePhaseTransform));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (oenormFile != null)
        localVarFormParams.put("oenormFile", oenormFile);

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oenormConversionConvertToGaebValidateBeforeCall(File oenormFile, String destinationGaebType, String targetExchangePhaseTransform, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = oenormConversionConvertToGaebCall(oenormFile, destinationGaebType, targetExchangePhaseTransform, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts ÖNorm files to GAEB files.
     * 
     * @param oenormFile The input file (optional)
     * @param destinationGaebType Defaults to GAEB XML V3.2 (optional)
     * @param targetExchangePhaseTransform Defaults to none, meaning no transformation will be done (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File oenormConversionConvertToGaeb(File oenormFile, String destinationGaebType, String targetExchangePhaseTransform) throws ApiException {
        ApiResponse<File> resp = oenormConversionConvertToGaebWithHttpInfo(oenormFile, destinationGaebType, targetExchangePhaseTransform);
        return resp.getData();
    }

    /**
     * Converts ÖNorm files to GAEB files.
     * 
     * @param oenormFile The input file (optional)
     * @param destinationGaebType Defaults to GAEB XML V3.2 (optional)
     * @param targetExchangePhaseTransform Defaults to none, meaning no transformation will be done (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> oenormConversionConvertToGaebWithHttpInfo(File oenormFile, String destinationGaebType, String targetExchangePhaseTransform) throws ApiException {
        com.squareup.okhttp.Call call = oenormConversionConvertToGaebValidateBeforeCall(oenormFile, destinationGaebType, targetExchangePhaseTransform, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts ÖNorm files to GAEB files. (asynchronously)
     * 
     * @param oenormFile The input file (optional)
     * @param destinationGaebType Defaults to GAEB XML V3.2 (optional)
     * @param targetExchangePhaseTransform Defaults to none, meaning no transformation will be done (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oenormConversionConvertToGaebAsync(File oenormFile, String destinationGaebType, String targetExchangePhaseTransform, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oenormConversionConvertToGaebValidateBeforeCall(oenormFile, destinationGaebType, targetExchangePhaseTransform, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
