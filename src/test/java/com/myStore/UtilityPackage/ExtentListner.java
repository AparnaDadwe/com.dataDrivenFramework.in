package com.myStore.UtilityPackage;


import java.io.File;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListner implements ITestListener {
	
	public static  ExtentSparkReporter sparkReporter;
	public static ExtentReports reportes;
	public static ExtentTest test;
	
	public void configureReport() {
		
		ReadConfig readConfig=new ReadConfig();
	//	String timestamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName="com.dataDrivenFramework.in" +  ".html";
		
		sparkReporter= new  ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//"+ reportName);
		
		reportes = new ExtentReports();
			//Add environmentals details
		
		reportes.attachReporter(sparkReporter);
		reportes.setSystemInfo("Hostname", "LocalHost");
		reportes.setSystemInfo("OS", "Window10");
		reportes.setSystemInfo("Testers name", "Aparna");
		reportes.setSystemInfo("Browser", "Chrome Browser");
		
		//configuration to change look and feel
		
		sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
		sparkReporter.config().setReportName("Test Report");//report name
		sparkReporter.config().setTheme(Theme.DARK);
//		sparkReporter.config().setTimeStampFormat("");
	
	}
	
	@Override
	public void onStart(ITestContext context) {
		configureReport();
		System.out.println("On start method invoke...........................");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish method invoke...........................");
		reportes.flush();
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test method Failed : " + result.getName());
		test=reportes.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is :" + result.getName(), ExtentColor.RED));//to add name in extent report	
	   // String screenShotPath= System.getProperty("user.dir" + "\\Screenshots\\" + result.getTestName()+ ".png");
	    
		String screenShotPath="src/test/resources/FailedTestCaseScreenShot" + result.getTestName() + ".png";
	    File screenShotFile=new File(screenShotPath);
	    
	    if(screenShotFile.exists()) 
	    {
	    	test.fail("Captured screenshot below :" + test.addScreenCaptureFromPath(screenShotPath));
	    }
	}
	//when test case is skipped it will invoked
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the test method skipped :" + result.getName());
		test=reportes.createTest(result.getName());
		
			test.log(Status.SKIP, MarkupHelper.createLabel("Skip Test Case  Is" + result.getName(),ExtentColor.YELLOW));//to add name in extent report	
	
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Name of the test method started :" + result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test method success :" + result.getName());
		test=reportes.createTest(result.getName());
		
			test.log(Status.PASS, MarkupHelper.createLabel("Pass Test Case  Is" + result.getName(),ExtentColor.YELLOW));//to add name in extent report	
	
	}
	
	//we want to execute configurationReport methof before all class so we call this method onStart()
	
   //invoke before test execution only
	

}
