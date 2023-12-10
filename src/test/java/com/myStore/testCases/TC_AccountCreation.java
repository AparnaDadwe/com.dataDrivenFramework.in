package com.myStore.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myStore.pageObject.AccountCreationPage;
import com.myStore.pageObject.IndexPage;
import com.myStore.pageObject.MyAccountDetailsPage;
import com.myStore.pageObject.MyAccountPage;
import com.aventstack.extentreports.util.Assert;
import com.myStore.UtilityPackage.ReadConfig;

public class TC_AccountCreation extends BaseClass {
	@Test
	public void verifyAccountCreation() {

		IndexPage ip=new IndexPage(driver);
		
		ip.clickOnSignIn();
		logger.info("Click On SignIn Link");
		
		MyAccountPage mc=new MyAccountPage(driver);
		
	mc.enterEmailId("cvairagade91@gmail.com");
	logger.info("Email address enter succesfully ");
		mc.clickOnCreateAnAccountBtn();
		logger.info("click on Create Account Succesfully");
		
		AccountCreationPage ac=new AccountCreationPage(driver);
		ac.clickOnTitleMrs();
		ac.enterFirstName("Chitra");
		ac.enterLastName("Vairagade");
		ac.enterPassword("chitra@1234");
		ac.clickOnNewsletterCheckBox();
		//logger.info("Entered all the required details for the registration");
		ac.clickOnRegisterBtn();
		MyAccountDetailsPage AcDetailedPage=new MyAccountDetailsPage(driver);
		String actualuserNameTitle=AcDetailedPage.getUserNameTitle();
		String expecteduserNametitle="Chitra Vairagade";
		assertEquals(actualuserNameTitle, expecteduserNametitle);
		
		logger.info("Registration Succesfully Done");
	}
	@Test
	public void verifyLoginCredential() throws IOException 
	{
IndexPage ip=new IndexPage(driver);
		
		ip.clickOnSignIn();
		logger.info("Click On SignIn Link");
		
		MyAccountPage mc=new MyAccountPage(driver);
		mc.enterRegEmail("pushpaDadwe91@gmail.com");
		mc.enterRegpassword("pushpa@1234");
		mc.clickOnsignInButton();
		MyAccountDetailsPage AcDetailedPage=new MyAccountDetailsPage(driver);
		String actualuserNameTitle=AcDetailedPage.getUserNameTitle();
//		String expecteduserNametitle="Pankaj Dadwe";
		if(actualuserNameTitle.equals("Pushpa Dadwe"))
		{
			logger.info("Verify login : success");
			assertTrue(true);
		}
		else 
		{
			
			logger.info("Verify login : failed");
			captureScreenShot(driver, "verifyLoginCredential");
			assertTrue(false);
		}
		//assertEquals(actualuserNameTitle, expecteduserNametitle);
		
		
	logger.info("Login Succesfully Done");
		
	}

}
