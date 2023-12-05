package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPage {
	WebDriver driver;
	
	public AccountCreationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement titleMr;
	
	
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement titleMrs;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lastName;


	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement newsletterCheckBox;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement registerBtn;
	
	public void clickOnTitleMr() {
		
		titleMr.click();
	}
public void clickOnTitleMrs() {
		
		titleMrs.click();
	}
public void  enterFirstName(String fname) {
	firstName.sendKeys(fname);
}
public void  enterLastName(String lname) {
	lastName.sendKeys(lname);
}
public void  enterPassword(String pwd) {
	password.sendKeys(pwd);
}
public void clickOnNewsletterCheckBox()
{
	newsletterCheckBox.click();
}
public void clickOnRegisterBtn() {
	registerBtn.click();
}
}
