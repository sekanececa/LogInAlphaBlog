package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	
	//Log In
	public static WebElement getLogInButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary btn-xlarge']"));
		return element;
	}
	
	public static void setLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	
	
	//Sing Up
	public static WebElement getSignUpButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[@class='btn btn-lg btn-success btn-xlarge']"));
		return element;	
	}
	
	public static void setSingUpButton(WebDriver driver) {
		getSignUpButton(driver).click();
	}
	
	
	
	
}
