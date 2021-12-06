package com.selenium;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public ExtentHtmlReporter extentHtmlReporter;
	public ExtentTest extentTest;
	public ExtentReports extentReports;
	
	
	@BeforeClass
	public void breforeClass()
	{
		extentHtmlReporter =new ExtentHtmlReporter("extent.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentTest =extentReports.createTest(getClass().getSimpleName());
		
		
	}
	
	@Test
	public void test1()
	{
		extentTest.log(Status.INFO,"test1 started");
		
	}
	@Test
	public void test2()
	{
		extentTest.log(Status.INFO, "test2 started");
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		logReport(result);
		
	}
	
	public void logReport(ITestResult result)
	{
		if(result.getStatus()==result.FAILURE)
		{
			extentTest.log(Status.ERROR,result.getTestName()+"failed");
			extentTest.log(Status.ERROR,result.getThrowable());
		}
		else if(result.getStatus()==result.SKIP)
		{
			extentTest.log(Status.SKIP,result.getTestName()+"Skipped");
			extentTest.log(Status.SKIP, result.getThrowable());
		}
		else {
			
			extentTest.log(Status.INFO, result.getTestName()+"Passed");
		}
		
	}
	
	@AfterClass
	public void afterClass() {
		extentReports.flush();
		
	}

}
