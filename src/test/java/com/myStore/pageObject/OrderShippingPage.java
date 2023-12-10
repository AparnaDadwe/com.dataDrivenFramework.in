package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {
WebDriver driver;
	
	public OrderShippingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//input[@id='cgv']")
   WebElement termsOfServiceCheckBox;
   
   @FindBy(xpath="//button[@name='processCarrier']")
   WebElement proceedToCheckOutBtnShipping;
   
   public void selectTermsOfServiceCheckBox() 
   {
	   termsOfServiceCheckBox.click();
   }
   
   public void clickOnproceedToCheckOutBtnShipping() {
	   proceedToCheckOutBtnShipping.click();
   }
   
   public String getCurrentPageUrl() {
	   return driver.getCurrentUrl();
   }
   
   
}
