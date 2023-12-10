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
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchBox;
	
	@FindBy(name = "submit_search")
	WebElement submitSearchBtn;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOutLink;
	
	public void enterDataInSearchBox(String searchKey) {
		searchBox.sendKeys(searchKey);
		}
	public void clickOnSearchBtn() {
		submitSearchBtn.click();
	}
	
	public String getUserNameTitle() {
		String userNameText=userNameTitle.getText();
		return userNameText;
	}
	
	public void clickOnSignOut() {
		signOutLink.click();
	}
	
	
	

}
