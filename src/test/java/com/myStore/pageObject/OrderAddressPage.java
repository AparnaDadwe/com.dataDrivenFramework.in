package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {
	WebDriver driver;
	
	public OrderAddressPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button//span[text()='Proceed to checkout']")
	WebElement proceesToCheckOutBtnAddress;
	
	public void clickOnproceesToCheckOutBtnAddress() {
		proceesToCheckOutBtnAddress.click();
	}
}
