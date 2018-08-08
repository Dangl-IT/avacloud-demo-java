package com.danglit.avacloud.client;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class DanglIdentityUtils {

    public static String getBearerToken(String clientId, String clientSecret) throws IOException {
        String basicCredentials = Credentials.basic(clientId, clientSecret);
        String requestBodyContent = "grant_type=client_credentials&scope=avacloud";
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBodyContent);
        Request request = new Request
            .Builder()
            .header("Authorization", basicCredentials)
            .url("https://identity.dangl-it.com/connect/token")
            .post(requestBody)
            .build();
        OkHttpClient httpClient = new OkHttpClient();
        Response response = httpClient.newCall(request).execute();
        String responseBody = response.body().string();
        JsonObject jsonResponse = new Gson().fromJson(responseBody, JsonObject.class);
        String accessToken = jsonResponse.get("access_token").getAsString();
        return accessToken;
    }

}
