package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	@FindBy(xpath="//img[@class='rounded-circle']")
	private WebElement img;
	
	@FindBy(linkText="Log Out")
	private WebElement logout;
	
	@FindBy(xpath="//i[@title='Employee']")
	private WebElement Employee;
	
	@FindBy(linkText="Employee-Details")
	private WebElement EmpDetails;
	
	 public Dashboard (WebDriver driver) {
	 PageFactory.initElements(driver, this);
  }

	public WebElement getImg() {
		return img;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getEmployee() {
		return Employee;
	}

	public WebElement getEmpDetails() {
		return EmpDetails;
	}
	 
	 
}
