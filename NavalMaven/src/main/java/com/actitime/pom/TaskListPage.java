package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerName;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;

	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement selectCustomerDD;

	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow '] ")
	private WebElement ourCompany;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomer;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCratedCustomerName;

	public TaskListPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);	
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getActualCratedCustomerName() {
		return actualCratedCustomerName;
	}

	 

}
