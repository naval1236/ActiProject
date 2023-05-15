package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;


public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() throws IOException, InterruptedException {
	 Reporter.log("createCustomer",true);	
	 FileLib f=new FileLib();
	 String custName=f.getExcelData("CreateCustomer", 1, 3);
	 String custDescp=f.getExcelData("CreateCustomer", 1, 4);
	 HomePage h=new HomePage(driver);
	 h.setTaskBtn();
	 TaskListPage t=new TaskListPage(driver);
	 t.getAddNew().click();
	 t.getNewCustomer().click();
	 t.getEnterCustomerName().sendKeys(custName);
	 t.getEnterCustomerDescription().sendKeys(custDescp);
	 t.getSelectCustomerDD().click();
	 t.getOurCompany().click();
	 t.getCreateCustomer().click();
	 Thread.sleep(4000);
	 String actualText = t.getActualCratedCustomerName().getText();
	 Assert.assertEquals(actualText, custName);
	
 }

	}

