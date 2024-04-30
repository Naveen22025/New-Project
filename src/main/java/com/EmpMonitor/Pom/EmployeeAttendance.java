package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.EmpMonitor.genrics.BasePropCls;

public class EmployeeAttendance {

	@FindBy(xpath="//a[@title='messages.new-employee-attendance']")
	private WebElement empattendance;
	
	@FindBy(id="LocationData")
	private WebElement location;
	
	@FindBy(id="DepartementData")
	private WebElement department;
	
	@FindBy(id="EmployeedateOfjoin")
	private WebElement monthbox;
	
	@FindBy(className="ui-datepicker-month")
	private WebElement month;
	
	@FindBy(className="ui-datepicker-year")
	private WebElement year;
	
	@FindBy(xpath="//button[.='Done']")
	private WebElement done;
	
	@FindBy(id="ShowEntriesList")
	private WebElement pagination;
	
	@FindBy(xpath="//a[@class='next']/../a[3]")
	private WebElement next;
	
	@FindBy(xpath="(//a[text()='rohit s'])[1]/../a")
	private WebElement selecteuser;
	
	@FindBy(xpath="//a[@title='Timesheets']")
	private WebElement timesheets;
	
	@FindBy(xpath="//a[@title=' Screenshots']")
	private WebElement screenshots;
	
	@FindBy(xpath="//a[@title='Web History']")
	private WebElement Webhistory;
	
	@FindBy(xpath="//a[@title=' App History ']")
	private WebElement apphistory;
	
	@FindBy(xpath="//a[@title='Key Strokes']")
	private WebElement keystroke;

	public WebElement getTimesheets() {
		return timesheets;
	}

	public WebElement getScreenshots() {
		return screenshots;
	}

	public WebElement getWebhistory() {
		return Webhistory;
	}

	public WebElement getApphistory() {
		return apphistory;
	}

	public WebElement getKeystroke() {
		return keystroke;
	}

	public WebElement getNext() {
		return next;
	}

	public EmployeeAttendance(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSelecteuser() {
		return selecteuser;
	}

	public WebElement getpagination() {
		
		return pagination;
	}
	
	public WebElement getMonthbox() {
		return monthbox;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getDone() {
		return done;
	}


	public WebElement getDepartment() {
		return department;
	}


	public WebElement getLocation() {
		return location;
	}

	public WebElement getEmpattendance() {
		return empattendance;
	}
	
	
	
}
