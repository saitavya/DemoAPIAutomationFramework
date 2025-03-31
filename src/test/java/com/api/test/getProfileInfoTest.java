package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class getProfileInfoTest {

	@Test(description = "Verify if login API is working....")
	public void getProfile() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("abc123","abc123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		userProfileResponse userProfileResponse = response.as(userProfileResponse.class);
	}
}
