/*
 * AVACloud API 1.41.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.41.0
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


import com.danglit.avacloud.client.models.GetStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusApi {
    private ApiClient apiClient;

    public StatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for statusGetStatus
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call statusGetStatusCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/status";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call statusGetStatusValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = statusGetStatusCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reports the health status of the AVACloud API
     * 
     * @return GetStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetStatus statusGetStatus() throws ApiException {
        ApiResponse<GetStatus> resp = statusGetStatusWithHttpInfo();
        return resp.getData();
    }

    /**
     * Reports the health status of the AVACloud API
     * 
     * @return ApiResponse&lt;GetStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetStatus> statusGetStatusWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = statusGetStatusValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GetStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reports the health status of the AVACloud API (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call statusGetStatusAsync(final ApiCallback<GetStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = statusGetStatusValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
