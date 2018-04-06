package com.mycompany.maven.MavenProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.gcs.frontend.collector.Order;
import com.gcs.frontend.common.Base;
import com.gcs.frontend.common.ExcelDriven;
import com.gcs.frontend.page.LoginPage;
import com.gcs.frontend.page.LogoutPage;
import com.gcs.frontend.page.SaleOrderPage;

public class SaleOrder extends Base {

	WebDriver driver;
	
	
	
	@Test(dataProviderClass = ExcelDriven.class,dataProvider = "testData")
	public void generateOrder(Order order) throws InterruptedException{
		
		
		driver  = getDriver();
		driver.get(getApplicationUrl());
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getEmailId().sendKeys(getUserName());
		lp.getPassword().sendKeys(getPassword());
		lp.clickLogin().click();
		
		
		
		SaleOrderPage saleOrder = new SaleOrderPage(driver);
		
		saleOrder.getOrder().click();
		saleOrder.getSaleOrder().click();
		saleOrder.getAddOrder().click();
		
		saleOrder.getOrderRefNo().sendKeys(order.getRefNo());
		
		Select select = new Select(saleOrder.getOrderChannel());
		select.selectByVisibleText(order.getOrderChannel());
		
		//saleOrder.openCustomerSelectionModal().click();
		
		saleOrder.getCustomer().sendKeys(order.getCustomerCode());
		Thread.sleep(3000);
		saleOrder.getCustomer().sendKeys(Keys.TAB);
		saleOrder.getCustomer().sendKeys(Keys.ENTER);
		Select select2 = new Select(saleOrder.getShippingAddress());
		select2.selectByVisibleText(order.getShippingAddress());
		
		
		
		//saleOrder.openProductSelectionModal().click();
		saleOrder.getProduct().sendKeys(order.getProductId());
		Thread.sleep(3000);
		saleOrder.getProduct().sendKeys(Keys.TAB);
		saleOrder.getProduct().sendKeys(Keys.ENTER);
		
		saleOrder.getQuantity().sendKeys(order.getQuantity());
		saleOrder.getAddToListButton().click();
		
		
		if(order.getIsSameAddress().equals("Y")){
		
		saleOrder.getSameAddress().click();
		}
		
		saleOrder.getPaymentType().sendKeys(order.getPaymentType());
		saleOrder.getRemark().sendKeys(order.getRemark());
		saleOrder.getSaveBttn().click();
		Thread.sleep(1000);
		
		Assert.assertEquals(saleOrder.getAlert().getText(), "Order Added Successfully");
		
		LogoutPage logoutP = new LogoutPage(driver);
		logoutP.getLogOutBttn().click();
	
	}
	
	
	@AfterClass
	public void browserCloset(){
		
		driver.close();
	}
	
	
	
}
