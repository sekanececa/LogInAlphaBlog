package main;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-blog.herokuapp.com/");
		
	
		HomePage.setLogInButton(driver);
		
		Thread.sleep(1000);
		
		LogInPage.setEmailInput(driver);
		LogInPage.setPasswordInput(driver);
		LogInPage.setLogInButton(driver);
		
		Thread.sleep(1000);
		
		
		ConfirmingPage.waitingForAlertBanner(driver);
		
		assertEquals("You have successfully logged in!",ConfirmingPage.getAlertBannerText(driver));
		
		driver.quit();
	}

}
