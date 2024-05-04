package com.EmpMonitor.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {

	@FindBy(xpath="//span[.='Reports']")
	private WebElement report;
	
	@FindBy(linkText="Reports Download")
	private WebElement reportdownloadbtn;
	
	@FindBy(id="role")
	private WebElement reportrolebtn;
	
	@FindBy(id="locations")
	private WebElement reportlocationbtn;
	
	@FindBy(id="departmentAppend")
	private WebElement reportdepartmentbtn;
	
	@FindBy(id="reportrangess")
	private WebElement reportdateranglebtn;
	
	@FindBy(xpath="//li[.='Last 30 Days']")
	private WebElement reportlast30daysbtn;
	
	@FindBy(id="download")
	private WebElement reportdownloadoptbtn;
	
	@FindBy(xpath="//input[@class='check_user']")
	private List<WebElement> alluserradiobtn;
	
	@FindBy(xpath="(//i[@title='View Report'])[1]")
	private WebElement viewreportbtn;
	
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/div[2]/div[1]/ul/li[2]/a")
	private WebElement apphistorybtn;
	
	public Reports(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getReportdownloadbtn() {
		return reportdownloadbtn;
	}

	public WebElement getReportrolebtn() {
		return reportrolebtn;
	}

	public WebElement getReportlocationbtn() {
		return reportlocationbtn;
	}

	public WebElement getReportdepartmentbtn() {
		return reportdepartmentbtn;
	}

	public WebElement getReportdateranglebtn() {
		return reportdateranglebtn;
	}
	
	

	public WebElement getReportlast30daysbtn() {
		return reportlast30daysbtn;
	}

	public WebElement getReportdownloadoptbtn() {
		return reportdownloadoptbtn;
	}

	public List<WebElement> getAlluserradiobtn() {
		for(WebElement radiobtn:alluserradiobtn)
			radiobtn.click();
		return alluserradiobtn;
	}

	public WebElement getViewreportbtn() {
		return viewreportbtn;
	}

	public WebElement getApphistorybtn() {
		
		return apphistorybtn;
	}
	
	
	
	
	
}
