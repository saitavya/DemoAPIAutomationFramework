package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.api.listeners.TestListener;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{//Catch the request and response info
	
	private static final Logger logger = (Logger) LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);
		logResponse(responseSpec);
		return response;
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE_URI"+ requestSpec.getBaseUri());
		logger.info("Request Header", requestSpec);
	}
	
	public void logResponse(FilterableResponseSpecification responseSpec) {
		logger.info("STATUS CODE",responseSpec.getStatusCode());
//		logger.info("Request Header", responseSpec.getClass().);
	}
	
	
}
