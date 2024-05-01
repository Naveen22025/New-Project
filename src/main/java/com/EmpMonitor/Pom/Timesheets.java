package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheets {

	
	@FindBy(xpath="//span[.='Timesheets']")
	private WebElement timesheet;
	
	@FindBy(id="locationdept")
	private WebElement timesheetlocation;
	
	@FindBy(id="getDepartments")
	private WebElement timesheetdepartment;
	
	@FindBy(id="reportranges")
	private WebElement daterange;
	
	@FindBy(className="active")
	private WebElement Lastmonth;

    public Timesheets(WebDriver driver) {
	PageFactory.initElements(driver, this);
   }

	public WebElement getTimesheet() {
		return timesheet;
	}

	public WebElement getTimesheetlocation() {
		return timesheetlocation;
	}

	public WebElement getTimesheetdepartment() {
		return timesheetdepartment;
	}

	public WebElement getDaterange() {
		return daterange;
	}

	public WebElement getLastmonth() {
		return Lastmonth;
	}
    

}


