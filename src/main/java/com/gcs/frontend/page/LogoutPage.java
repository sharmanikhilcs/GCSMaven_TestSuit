package com.gcs.frontend.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

	
	public WebDriver driver;
	
	
	
	By logOutBttn = By.cssSelector("div[ng-click='logout()']");
	
	
	
	
	
	public LogoutPage(WebDriver driver2){
		driver = driver2;
	}
	
	
	
	
	public WebElement getLogOutBttn(){
		return driver.findElement(logOutBttn);
	}
	
	
}
