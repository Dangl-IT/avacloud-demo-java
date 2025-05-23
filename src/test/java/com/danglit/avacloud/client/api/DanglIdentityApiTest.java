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
import com.danglit.avacloud.client.models.ForgotPasswordPost;
import com.danglit.avacloud.client.models.LoginPost;
import com.danglit.avacloud.client.models.RegisterPost;
import com.danglit.avacloud.client.models.TokenLoginPost;
import com.danglit.avacloud.client.models.TokenRefreshPost;
import com.danglit.avacloud.client.models.TokenResponseGet;
import com.danglit.avacloud.client.models.UserInfoGet;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DanglIdentityApi
 */
@Ignore
public class DanglIdentityApiTest {

    private final DanglIdentityApi api = new DanglIdentityApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityGetUserInfoTest() throws Exception {
        UserInfoGet response = api.danglIdentityGetUserInfo();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityLoginAndReturnTokenTest() throws Exception {
        TokenLoginPost model = null;
        TokenResponseGet response = api.danglIdentityLoginAndReturnToken(model);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityLoginWithCookieTest() throws Exception {
        LoginPost model = null;
        String redirectUrl = null;
        api.danglIdentityLoginWithCookie(model, redirectUrl);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityRefreshTokenTest() throws Exception {
        TokenRefreshPost model = null;
        TokenResponseGet response = api.danglIdentityRefreshToken(model);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityRegisterTest() throws Exception {
        RegisterPost registerModel = null;
        api.danglIdentityRegister(registerModel);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentityRequestPasswordResetTest() throws Exception {
        ForgotPasswordPost forgotPasswordModel = null;
        api.danglIdentityRequestPasswordReset(forgotPasswordModel);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void danglIdentitySignOutWithSignInManagerTest() throws Exception {
        api.danglIdentitySignOutWithSignInManager();

        // TODO: test validations
    }
    
}
