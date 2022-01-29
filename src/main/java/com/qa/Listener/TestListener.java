package com.qa.Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cryptoquant.qa.util.TestUtil;

public class TestListener extends TestUtil implements ITestListener {

	public void onTestStart(ITestResult result) {
	
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result, Object String) throws IOException {
		System.out.println("The name of the testcase failed is :"+result.getName());
		failedTestScreenshot(result.getMethod().getMethodName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
