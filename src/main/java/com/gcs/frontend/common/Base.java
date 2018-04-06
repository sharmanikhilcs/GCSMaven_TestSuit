package com.gcs.frontend.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.gcs.frontend.collector.Order;

public class Base {

     private WebDriver driver = null;
     private String applicationUrl = null;
     private String userName = null;
     private String password = null;
     
 	@BeforeClass
 	public void beforeClass() throws IOException, URISyntaxException{
 	
 		initializeApplicationConfig();
 	}
 	
	public WebDriver getDriver() {
		return driver;
	}


	public String getApplicationUrl() {
		return applicationUrl;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	private void initializeApplicationConfig() throws IOException, URISyntaxException{
		Properties prop = new Properties();
		URL resource = this.getClass().getClassLoader().getResource("data.properties");	
		File file  = new File(resource.toURI());
		FileInputStream fStream = new FileInputStream(file);
		prop.load(fStream);
		String browserName = prop.getProperty(Constant.BROWSER);
		
		if(browserName.equals("chrome")){
			System.setProperty(prop.getProperty(Constant.CHROME_DRIVER),prop.getProperty(Constant.CHROME_DRIVER_PATH));
			 driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")) {
			System.setProperty(prop.getProperty(Constant.FIREFOX_DRIVER),prop.getProperty(Constant.FIREFOX_DRIVER_PATH));
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE")) {
			System.setProperty(prop.getProperty(Constant.IE_DRIVER),prop.getProperty(Constant.IE_DRIVER_PATH));
			driver = new InternetExplorerDriver();
		}
	
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		applicationUrl = prop.getProperty(Constant.APPLICATION_URL);
		userName = prop.getProperty(Constant.EMAIL_ID);
		password =  prop.getProperty(Constant.PASSWORD);
	}
	
	
	
	

	
	
	
	
	
	
}
