package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement createEmailAddress;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement createAnAccountBtn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement registeredUserEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement registeredUserPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signInButton;
	
	
	public void enterEmailId(String emailId) {
		createEmailAddress.sendKeys(emailId);
		
	}
	public void clickOnCreateAnAccountBtn() {
		createAnAccountBtn.click();
	}
	 public void enterRegEmail(String loginEmail) {
		 registeredUserEmail.sendKeys(loginEmail);
	 }
	 
	 public void enterRegpassword(String loginpassword) {
		 registeredUserPassword.sendKeys(loginpassword);
	 }
	 public void clickOnsignInButton() {
		 signInButton.click();
		}
	

}
