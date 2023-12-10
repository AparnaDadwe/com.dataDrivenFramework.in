package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {
	
WebDriver driver;
	
	public OrderPaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement payByBankWire;
	
	@FindBy(xpath="//a[@title='//a[@title='Pay by check.']']")
	WebElement payByCheck;
	
	public void clickOnpayByBankWire() {
		payByBankWire.click();
	}
	
	public void clickOnpayByCheck() {
		payByCheck.click();
	}
	
	public void getOrderPaymentPageTitle() {
		driver.getTitle();
	}

}
