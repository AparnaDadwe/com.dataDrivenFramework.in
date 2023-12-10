package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import actionDriver.Action;

public class ProductDisplayPage {
	WebDriver driver;
	
	public ProductDisplayPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	WebElement quntityNo;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement sizeSelect;
	
	@FindBy(xpath="//a[@id='color_13']")
	WebElement orangeColor;
	
	@FindBy(xpath="//a[@id='color_14']")
	WebElement blueColor;
	
	@FindBy(xpath="//button//span[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//div[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement productAddToCartMsg;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement proceedToCheckOutLink;
	
	public void enterQuantity(String qty) {
		quntityNo.clear();
		quntityNo.sendKeys(qty);
	}
	
	public void selectSize(String sizeText) {
		Select select=new Select(sizeSelect);
		select.selectByVisibleText(sizeText);
	}
	
	public void clickOnOrangeColor() {
		orangeColor.click();
	}
	public void clickOnBlueColor() {
		blueColor.click();
	}
    public void clickOnAddToCartBtn() {
	addToCartBtn.click();
	}
    public String getproductAddToCartMsg() {
    	 return productAddToCartMsg.getText();
    	 
    }
    public void clickOnProceedCheckOut() {
    	proceedToCheckOutLink.click();
    }
	
	

}
