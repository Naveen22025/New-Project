package com.EmpMonitor.Pom;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Employee {

	@FindBy(xpath="//i[@title='Employee']")
	private WebElement Employee;
	
	@FindBy(linkText="Employee-Details")
	private WebElement EmpDetails;
	
	@FindBy(id="addBulkRegBtn")
	private WebElement Bulkreg;
	
	@FindBy(xpath="(//input[@class='custom-file-input'])[2]")
	private WebElement Bulkbtn;
	
	@FindBy(id="roles")
	private WebElement role;
	
	@FindBy(id="locations")
	private WebElement locations;
	
	@FindBy(xpath="//div[@class='col-md-3']/span/span[1]")
	private WebElement dept;
	
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//li[.=' Testing']")
	private WebElement seldept;
	
	@FindBy(className="form-control")
	private WebElement search;
	
	@FindBy(id="ExportButton")
	private WebElement export;
	
	@FindBy(xpath="//input[@value='Shift_Name']")
	private WebElement shiftexport;
	
	@FindBy(xpath="//input[@value='submit']")
	private WebElement submitexport;
	
	@FindBy(id="ShowEntriesList")
	private WebElement pagination;
	
	@FindBy(id="activeStatus")
	private WebElement active;
	
	@FindBy(id="inActiveStatus")
	private WebElement suspended;
	
	@FindBy(xpath="//button[@type='button'][@onclick='deletedUserList()']")
	private WebElement deletehistory;
	
	@FindBy(xpath="(//span[.='×'])[19]")
	private WebElement closehistory;
	
	public WebElement getClosehistory() {
		return closehistory;
	}

	public void setClosehistory(WebElement closehistory) {
		this.closehistory = closehistory;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getSuspended() {
		return suspended;
	}

	public WebElement getDeletehistory() {
		return deletehistory;
	}

	public WebElement getExport() {
		return export;
	}

	public void getPagination() {
		Select s = new Select(pagination);
		s.selectByVisibleText("25");
	}
	public WebElement getShiftexport() {
		return shiftexport;
	}

	public WebElement getSubmitexport() {
		return submitexport;
	}

	public Employee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    public WebElement getSeldept() {
		return seldept;
	}

	public WebElement getRole() {
    	Select s = new Select(role);
    	s.selectByVisibleText("Employee ");
		return role;
	}

	public WebElement getLocations() {
		Select s = new Select(locations);
    	s.selectByVisibleText("banglore");
		return locations;
	}

	public WebElement getDept() {
		return dept;
	}

    public WebElement getEmployee() {
	return Employee;
}

   public WebElement getEmpDetails() {
	return EmpDetails;		
}

public WebElement getBulkreg() {
	return Bulkreg;
}
public WebElement getBulkbtn() {
	File f= new File("./src/test/resources/data/Employee Registration2.xlsx");
	String Absolutepath = f.getAbsolutePath();
	return Bulkbtn;
}
}