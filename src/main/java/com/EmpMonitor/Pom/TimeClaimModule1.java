package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeClaimModule1 {

	@FindBy(xpath="//span[text()='Time Claim']")
	private WebElement timeclaim;
	
	@FindBy(id="reportrange")
	private WebElement daterange;
	
	@FindBy(xpath="//li[text()='Last Month']")
	private WebElement lastmonthbtn;
	
	@FindBy(id="statusField")
	private WebElement status;
	
	@FindBy(id="offline-btn")
	private WebElement offlinebtn;
	
	@FindBy(id="break-btn")
	private WebElement breakbtn;
	
	@FindBy(id="attendance-btn")
	private WebElement attendancebtn;
	
	@FindBy(xpath="//label[.='Off']")
	private WebElement autoapprovebtn;
	
	@FindBy(xpath="(//button[@class='btn btn-primary btn-block'])[1]")
	private WebElement timeclaimbtn;
	
	@FindBy(id="modalReasonShowOption")
	private WebElement timeclaimapprovebtn;
	
	@FindBy(className="btn btn-secondary")
	private WebElement cancilbtn;
	
	public TimeClaimModule1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeclaim() {
		return timeclaim;
	}

	public WebElement getDaterange() {
		return daterange;
	}

	public WebElement getLastmonthbtn() {
		return lastmonthbtn;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getOfflinebtn() {
		return offlinebtn;
	}

	public WebElement getBreakbtn() {
		return breakbtn;
	}

	public WebElement getAttendancebtn() {
		return attendancebtn;
	}

	public WebElement getAutoapprovebtn() {
		return autoapprovebtn;
	}

	public WebElement getTimeclaimbtn() {
		return timeclaimbtn;
	}

	public WebElement getTimeclaimapprovebtn() {
		return timeclaimapprovebtn;
	}

	public WebElement getCancilbtn() {
		return cancilbtn;
	}
	
	
}
