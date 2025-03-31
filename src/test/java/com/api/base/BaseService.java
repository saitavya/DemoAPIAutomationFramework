package com.api.base;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseService { // wrapper for rest assured
// Handles the base uri
// creating the request
// handling the response
	
	private static final String BASE_URL = "http://64.227.160.186:8080/";
	private RequestSpecification requestSpecification;
	
	static {//Executes this code only once
		RestAssured.filters(new LoggingFilter());
	}
	
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization","Bearer "+token);
	}
	
	public BaseService() {// Constructor to create the request Specification
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	protected Response postRequest(Object payload, String endpoint) {
		return requestSpecification.body(payload).post(endpoint);
	}
	
	protected Response getRequest(String endPoint) {
		return requestSpecification.get(endPoint);
	}
	
	protected Response putRequest(Object payload, String endpoint) {
		return requestSpecification.body(payload).put(endpoint);
	}
	
	
	
	
}
