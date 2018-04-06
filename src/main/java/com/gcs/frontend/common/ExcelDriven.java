package com.gcs.frontend.common;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gcs.frontend.collector.Order;

public class ExcelDriven {
	

	
@DataProvider(name = "testData")
public Object[] getData() throws IOException, URISyntaxException{
	
	ArrayList<Order> list= new ArrayList<Order>();
	
	URL resource = this.getClass().getClassLoader().getResource("Order.xls");
	File file  = new File(resource.toURI());
	
	FileInputStream fIStream = new FileInputStream(file);
	HSSFWorkbook wb = new HSSFWorkbook(fIStream);
	HSSFSheet sheet=   wb.getSheet("Sheet1");
	int rowCount =0;
	rowCount = sheet.getPhysicalNumberOfRows();
	
	for(int i = 1;i<rowCount;i++){
		Order order = new Order();
		Row row = sheet.getRow(i);
		order.setRefNo(row.getCell(0)!=null?row.getCell(0).getStringCellValue():"");
		order.setOrderChannel(row.getCell(1)!=null?row.getCell(1).getStringCellValue():"");
		order.setCustomerCode(row.getCell(2)!=null?row.getCell(2).getStringCellValue():"");
		order.setShippingAddress(row.getCell(3)!=null?row.getCell(3).getStringCellValue():"");
		order.setProductId(row.getCell(4)!=null?row.getCell(4).getStringCellValue():"");
		order.setQuantity(row.getCell(5)!=null?row.getCell(5).getStringCellValue():"");
		order.setIsSameAddress(row.getCell(6)!=null?row.getCell(6).getStringCellValue():"");
		order.setPaymentType(row.getCell(7)!=null?row.getCell(7).getStringCellValue():"");
		order.setSalesChannelDate(row.getCell(8)!=null?row.getCell(8).getStringCellValue():"");
		order.setShippingDate(row.getCell(9)!=null?row.getCell(9).getStringCellValue():"");
		order.setDeliveryDate(row.getCell(10)!=null?row.getCell(10).getStringCellValue():"");
		order.setRemarks(row.getCell(11)!=null?row.getCell(11).getStringCellValue():"");
		
		
		
		
		list.add(order);
	}
	
/*	for(Order or:list){
		System.out.println(or);
	}
	*/
	return  list.toArray();
}




}
