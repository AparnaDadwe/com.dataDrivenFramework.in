package com.myStore.UtilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utiltity {
	
	public static boolean selectByIndex(WebElement ele, int index) {
		boolean flag= false;
		try {
			Select select=new Select(ele);
			select.selectByIndex(index);
			flag=true;
			return true;
		}
		catch(Exception e){
			flag=false;
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("Elements selected by index");
			}else {
				System.out.println("Element not select by index");
			}
		}
		
		}
	
	public static boolean selectByValue(WebElement ele, String  value) {
		boolean flag= false;
		try {
			Select select=new Select(ele);
			select.selectByValue(value);
			flag=true;
			return true;
		}
		catch(Exception e){
			flag=false;
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("Elements selected by value");
			}else {
				System.out.println("Element not select by value");
			}
		}
		
		}
	public static boolean selectByVisibleText(WebElement ele, String visibleText) {
		boolean flag= false;
		try {
			Select select=new Select(ele);
			select.selectByVisibleText(visibleText);
			flag=true;
			return true;
		}
		catch(Exception e){
			flag=false;
			return false;
			
		}
		finally {
			if(flag) {
				System.out.println("Elements selected by index");
			}else {
				System.out.println("Element not select by index");
			}
		}
		
		}
	public static void selectDateFromDatePicker(WebDriver driver, String month, String year, String date) 
	{
		driver.findElement(By.xpath("//select[@id='days']")).click();
	 WebElement dropDownDate=driver.findElement(By.xpath("//select[@id='months']"));
	 
		
		
		
	}

}
