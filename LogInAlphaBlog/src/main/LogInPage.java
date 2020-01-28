package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	private static WebElement element = null;
	

	//Email
	public static WebElement getEmailInput(WebDriver driver) {
		element=driver.findElement(By.id("session_email"));
		return element;
	}
	
	public static void setEmailInput(WebDriver driver) {
		getEmailInput(driver).sendKeys("malena@test.com");
	}
	
	
	//Password
		public static WebElement getPasswordInput(WebDriver driver) {
			element=driver.findElement(By.id("session_password"));
			return element;
		}
		
		public static void setPasswordInput(WebDriver driver) {
			 getPasswordInput(driver).sendKeys("malena");
		}
		
		
		//LogIN Button
		public static WebElement getLogInButton(WebDriver driver) {		
			element=driver.findElement(By.xpath("//input[@name='commit']"));
			return element;
		}
				
		public static void setLogInButton(WebDriver driver) {	
			getLogInButton(driver).click();;
		}
					

}
