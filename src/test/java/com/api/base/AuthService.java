package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.signUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	private static final String BASE_Path = "/api/auth";
	
	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_Path+"login");
	}
	
	public Response signUp(signUpRequest payload) {
		return postRequest(payload, BASE_Path+"signup");
	}
	
	public Response forgotPasssword(String emailAddress) {// This can be done if only one field is to be passed
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_Path+"forgot-passowrd");
	}

}
