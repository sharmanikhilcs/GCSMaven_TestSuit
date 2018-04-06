package com.mycompany.maven.MavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcs.frontend.common.Base;
import com.gcs.frontend.common.Constant;
import com.gcs.frontend.page.LoginPage;

public class Login extends Base {
	
@Test
public void login(){
	
	WebDriver driver  = getDriver();
	driver.get(getApplicationUrl());
	
	LoginPage lp = new LoginPage(driver);
	
	lp.getEmailId().sendKeys(getUserName());
	lp.getPassword().sendKeys(getPassword());
	lp.clickLogin().click();
}






}
