package com.myStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	
	
		WebDriver driver;
			
			public OrderConfirmationPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(xpath="//button[@class='button btn btn-default button-medium']//span[text()='I confirm my order']")
			WebElement comfirmMyOrderBtn;
			
			@FindBy(xpath="//p[@class='alert alert-success']")
			WebElement orderConfirmatioSuccessMsg;
			
			@FindBy(xpath="//a[@title='Log me out']")
			WebElement signOut;
			
			@FindBy(xpath="//a[@Title='Go to your order history page']")
			WebElement backToorderHistoryPage;
			
			public void clickonConfirmOrder() {
				comfirmMyOrderBtn.click();
			}
			
			public String getorderConfirmatioSuccessMsg() {
				return orderConfirmatioSuccessMsg.getText();
			}
			public void clickOnSignOut() {
				signOut.click();
			}
			
			public void clickOnbackToorderHistory() {
				backToorderHistoryPage.click();
			}
			
			
			
}
