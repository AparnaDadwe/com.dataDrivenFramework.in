package com.myStore.testCases;

import org.testng.annotations.Test;

import com.myStore.pageObject.IndexPage;
import com.myStore.pageObject.MyAccountPage;

public class TC_AccountPageTest extends BaseClass {
	
	@Test
	
	public void verifyRegistrationAndLogin() {
		
		
		
		IndexPage ip=new IndexPage(driver);
		
		ip.clickOnSignIn();
		logger.info("Click On SignIn Link");
		
		MyAccountPage mc=new MyAccountPage(driver);
		
	mc.enterEmailId("anuradha123@gmail.com");
	logger.info("Email address enter succesfully ");
		mc.clickOnCreateAnAccountBtn();
		//logger.info("click on Create Account Succesfully");
		
		
	}

}
