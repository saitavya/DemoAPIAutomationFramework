package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	private static final Logger logger = (Logger) LogManager.getLogger(TestListener.class);
	
	public void onStart(ITestContext context) {
	    logger.info("Test Run started");
	  }
	
	public void onFinish(ITestContext context) {
		logger.info("Test Run completed");
	  }
	
	public void onTestSuccess(ITestResult result) {
		logger.info("Passed!!!"+result.getMethod().getMethodName());
		logger.info("Description!!!"+result.getMethod().getDescription());
	  }
	
	public void onTestFailure(ITestResult result) {
		logger.error("Failed!!!"+result.getMethod().getMethodName());
		
	  }
	
	public void onTestSkipped(ITestResult result) {
		logger.error("Skipped!!!"+result.getMethod().getMethodName());
	  }

}
