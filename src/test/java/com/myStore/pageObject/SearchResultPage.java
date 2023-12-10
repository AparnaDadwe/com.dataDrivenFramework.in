package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriver.Action;

public class SearchResultPage {
	WebDriver driver;
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5//a[@title='Faded Short Sleeve T-shirts'  and @itemprop='url']")
	WebElement searchResultProduct;
	
	@FindBy(xpath = "//a[@title='View']//span[text()='More']")
	WebElement moreLink;
	
	
	public String getSearchResultProductName()
	{
		return searchResultProduct.getText();
		
	}
	
	public void clickOnsearchResultProduct() {
		Action.click(driver, searchResultProduct);
	}
	
	public void clickOnMoreLink() {
		
		moreLink.click();
		
	}
	
	

}
