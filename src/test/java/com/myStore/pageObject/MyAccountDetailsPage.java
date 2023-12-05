package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountDetailsPage {
	WebDriver driver;
	
	public MyAccountDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement userNameTitle;
	
	public String getUserNameTitle() {
		String userNameText=userNameTitle.getText();
		return userNameText;
	}
	
	
	

}
