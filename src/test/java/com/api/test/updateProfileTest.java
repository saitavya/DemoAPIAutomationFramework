package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.profileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class updateProfileTest {

	@Test(description = "Verify if the API is working")
	public void updateProfile() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("uday1234","uday1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		userProfileResponse userProfileResponse = response.as(userProfileResponse.class);
	    Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");
	    profileRequest ProfileRequest = new profileRequest.Builder()
	    		.firstName("abd")
	    		.lastName("def")
	    		.email("abc.def@gmail.com")
	    		.mobileNumber("9999944444")
	    		.build();
	   response = userProfileManagementService.updateProfile(ProfileRequest, loginResponse.getToken());
	   System.out.println(response);
	}
}
