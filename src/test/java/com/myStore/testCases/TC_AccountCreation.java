package com.myStore.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.myStore.pageObject.AccountCreationPage;
import com.myStore.pageObject.IndexPage;
import com.myStore.pageObject.MyAccountDetailsPage;
import com.myStore.pageObject.MyAccountPage;
import com.myStore.utility.ReadConfig;

public class TC_AccountCreation extends BaseClass {
	@Test(enabled = false)
	public void verifyAccountCreation() {

		IndexPage ip=new IndexPage(driver);
		
		ip.clickOnSignIn();
		logger.info("Click On SignIn Link");
		
		MyAccountPage mc=new MyAccountPage(driver);
		
	mc.enterEmailId("pankaj123@gmail.com");
	logger.info("Email address enter succesfully ");
		mc.clickOnCreateAnAccountBtn();
		logger.info("click on Create Account Succesfully");
		
		AccountCreationPage ac=new AccountCreationPage(driver);
		ac.clickOnTitleMrs();
		ac.enterFirstName("Pankaj");
		ac.enterLastName("Dadwe");
		ac.enterPassword("pankaj@1234");
		ac.clickOnNewsletterCheckBox();
		logger.info("Entered all the required details for the registration");
		ac.clickOnRegisterBtn();
		MyAccountDetailsPage AcDetailedPage=new MyAccountDetailsPage(driver);
		String actualuserNameTitle=AcDetailedPage.getUserNameTitle();
		String expecteduserNametitle="Pankaj Dadwe";
		assertEquals(actualuserNameTitle, expecteduserNametitle);
		
		logger.info("Registration Succesfully Done");
	}
	@Test
	public void verifyLoginCredential() 
	{
IndexPage ip=new IndexPage(driver);
		
		ip.clickOnSignIn();
		logger.info("Click On SignIn Link");
		
		MyAccountPage mc=new MyAccountPage(driver);
		mc.enterRegEmail("pankaj123@gmail.com");
		mc.enterRegpassword("pankaj@1234");
		mc.clickOnsignInButton();
		MyAccountDetailsPage AcDetailedPage=new MyAccountDetailsPage(driver);
		String actualuserNameTitle=AcDetailedPage.getUserNameTitle();
		String expecteduserNametitle="Pankaj Dadwe";
		assertEquals(actualuserNameTitle, expecteduserNametitle);
		
		logger.info("Login Succesfully Done");
		
	}

}
