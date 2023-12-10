package com.myStore.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.myStore.UtilityPackage.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	String url=readConfig.getBaseUrl();
	String browser=readConfig.getBrowser();
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setUp() 
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    		driver=new ChromeDriver();
    		break;
		case "edge":
    		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
   		 driver =new EdgeDriver(); 
   		 break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", "driver/geckodriver.exe");
    		driver=new FirefoxDriver();
   		 break;
   		 default :
   			 driver=null;
   			 break;
   			}
		logger= LogManager.getLogger("com.dataDrivenFramework.in");

		driver.get(url);
		//logger.info("Url Opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@AfterClass
	public void tearDown() {
		
		//driver.quit();
	}
	
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		TakesScreenshot screenShot=((TakesScreenshot)driver);
		//call getScreenshotAs method to take screenshot
		File src=screenShot.getScreenshotAs(OutputType.FILE);
		//File des=new File(System.getProperty("user.dir" + "//Screenshots//" + testName+ ".png"));
		
		File des=new File(("src/test/resources/FailedTestCaseScreenShot" + testName + ".png"));
		
		//FileUtils.copyFile(file, new File("src/test/resources/screenshot/" + screenshotName + ".png"));
		
		FileUtils.copyFile(src, des);
		}
}
