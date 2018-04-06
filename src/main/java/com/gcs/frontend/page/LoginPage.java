package com.gcs.frontend.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	public WebDriver driver;
	
	
By emailId = By.xpath("//input[@id='loginEmail']");
By pwd = By.xpath("//input[@id='loginPassword']");
By loginButton = By.xpath("//button[@id='loginSubmit']");




public LoginPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
driver = driver2;

}


public WebElement getEmailId(){
	return driver.findElement(emailId);
}


public WebElement getPassword(){
	return driver.findElement(pwd);
}


public WebElement clickLogin(){
	return driver.findElement(loginButton);
}



}
