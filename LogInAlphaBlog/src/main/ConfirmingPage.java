package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmingPage {
	
	public static void waitingForAlertBanner(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash_success")));
		
	}
	
	public static String getAlertBannerText(WebDriver driver) {
		
		return driver.findElement(By.id("flash_success")).getText();
	}

}
