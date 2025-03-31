package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.signUpRequest;

import io.restassured.response.Response;

public class CreateAccount {
	@Test(description = "Verify if login API is working....")
	public void createAccountTest(){
		signUpRequest signUpRequest = new signUpRequest.Builder()
		.email("abc123@gmail.com")
		.firstName("abc")
		.lastName("def")
		.userName("abcd1234")
		.mobileNumber("8888844444")
		.Password("abcd1234")
		.build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
	}
}
