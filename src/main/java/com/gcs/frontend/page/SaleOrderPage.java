package com.gcs.frontend.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaleOrderPage {

	public WebDriver driver;
	
	By order = By.xpath("//ul[contains(@class,'nav-justified')]/li[2]/div/div[1]/a");
	By saleOrder = By.xpath("//ul[contains(@class,'nav-justified')]/li[2]/div/ul/li[1]");
	By addOrder = By.xpath("//button[@id='SOAddNew']");
	
	By orderRefNo = By.cssSelector("input#SOAddRef1");
	By orderChannel = By.cssSelector("select#SOAddChannel");
	By customer = By.cssSelector("input#customers_value");
	By shipAddress = By.cssSelector("select#SOAddSA");
	By product = By.cssSelector("input#products_value");
	By quantity = By.cssSelector("input#SOAddQty");
	By addToList = By.cssSelector("span#SOAddSAdd");
	By sameAddress= By.xpath("//div[@ng-if='singleorderData.deliveryAddressName']/div[2]/parent::div/div[1]/div/span/md-checkbox/div[1]");
	By bilAddress = By.xpath("//select[@ng-model = 'singleorderData.billingAddress']");
	By paymentType = By.cssSelector("select#SOAddPT");
	By remark = By.cssSelector("textarea#SOAddRemarks");
	By saveBttn = By.cssSelector("input#SOAddSubmit");
	
	By alert = By.xpath(("//span[@data-notify='message']"));
	
	
	
	
	public SaleOrderPage(WebDriver driver2){
		driver = driver2;
	}
	
	
	public WebElement getOrder(){
		return driver.findElement(order);
	}
	
	
	
	public WebElement getSaleOrder(){
		return driver.findElement(saleOrder);
	}
	
	
	public WebElement getAddOrder(){
		return driver.findElement(addOrder);
	}
	
	
	public WebElement getOrderRefNo(){
		return driver.findElement(orderRefNo);
	}
	
	
	public WebElement getOrderChannel(){
		return driver.findElement(orderChannel);
	}
	


	
	public WebElement getCustomer(){
		return driver.findElement(customer);
	}
	

	
	public WebElement getShippingAddress(){
		return driver.findElement(shipAddress);
	}
	
	
	
	public WebElement getProduct(){
		return driver.findElement(product);
	}


public WebElement getQuantity(){
	return driver.findElement(quantity);
}



public WebElement getAddToListButton(){
	return driver.findElement(addToList);
}


public WebElement getSameAddress(){
	return driver.findElement(sameAddress);
}


public WebElement getBilAddress(){
	return driver.findElement(bilAddress);
}


	
public WebElement getPaymentType(){
	return driver.findElement(paymentType);
}



public WebElement getRemark(){
	return driver.findElement(remark);
}


public WebElement getSaveBttn(){
	return driver.findElement(saveBttn);
}


public WebElement getAlert(){
	return driver.findElement(alert);
}



}
