package actionDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action{
	

	public static void scrollByVisibleOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
	}
	
	public static void click(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	
	public static boolean findElements(WebDriver driver, WebElement ele) {
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		}
		catch(Exception e){
			flag=false;
			
		}
		finally {
			if(flag) {
				System.out.println("Elements are found successfully");
			}else {
				System.out.println("Unable to locate element");
			}
		}
		return flag;
	}
	
	public static boolean isDisplayed(WebDriver driver, WebElement ele) {
		boolean flag= false;
		flag=findElements(driver, ele);
		if(flag) {
			flag=ele.isDisplayed();
			if(flag) {
				System.out.println("Elements displayed  successfully");
			}
			else {
				System.out.println("Unable to displayed");
			}
				
			}
		return flag;
		}
	public static boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag= false;
		flag=findElements(driver, ele);
		if(flag) {
			flag=ele.isSelected();
			if(flag) {
				System.out.println("Elements selected   successfully");
			}
			else {
				System.out.println("Elements is not selected successfully");
			}
				
			}
		return flag;
		}
	public static boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean flag= false;
		flag=findElements(driver, ele);
		if(flag) {
			flag=ele.isEnabled();
			if(flag) {
				System.out.println("Elements is enabled  successfully");
			}
			else {
				System.out.println("Elements is not enabled");
			}
				
			}
		return flag;
		}
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
	public static boolean javaScriptClick(WebDriver driver,WebElement ele) throws Exception{
		boolean flag= false;
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].click()", ele);
			flag=true;
			
		}
		catch(Exception e){
		
			throw e;
		}
		finally {
			if(flag) {
				System.out.println("JS click action is performed");
			}else if(!flag) {
				System.out.println("JS click action is not performed");
			}
		}
		return flag;
		}
	public static void implicitWaitFunction(WebDriver driver,int timeouts) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public static void explicitWait(WebDriver driver,WebElement ele, Duration timeouts) {
		WebDriverWait wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}


}
