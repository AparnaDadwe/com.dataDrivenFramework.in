package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	WebDriver driver;
	
	public OrderSummaryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOutSummary;
	
	public void clickOnProceedToCheckOutSummary() {
		proceedToCheckOutSummary.click();
	}

}
