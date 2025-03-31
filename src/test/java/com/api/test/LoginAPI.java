package com.api.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)

public class LoginAPI {

	@Test(description = "Verify if login API is working....")
	public void loginTest() {
//		RestAssured.baseURI="http://64.227.160.186:8080";
//		RequestSpecification x = RestAssured.given();
//		RequestSpecification y = x.header("Content-Type", "application/json");
//		RequestSpecification z = y.body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}");
//	    Response response = z.post("/api/auth/login");
//	    System.out.println(response.asPrettyString());
//		-------------------------------------------------------------
//		Response response = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").
//				body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}").post("/api/auth/login");
//		System.out.println(response);
		LoginRequest loginRequest = new LoginRequest("uday1234","uday1234");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getEmail());//Print any particular value now based on the login response
	}
}
