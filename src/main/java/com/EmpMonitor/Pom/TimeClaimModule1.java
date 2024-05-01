package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeClaimModule1 {

	@FindBy(xpath="//span[.='Time Claim']")
	private WebElement timeclaim1;
	
	@FindBy(id="reportrange")
	private WebElement daterange;
	
	@FindBy(xpath="//li[text()='Last 30 Days']")
	private WebElement lastmonthbtn;

	@FindBy(id="statusField")
	private WebElement status;
	
	@FindBy(id="offline-btn")
	private WebElement offlinebtn;
	
	@FindBy(id="break-btn")
	private WebElement breakbtn;
	
	@FindBy(id="attendance-btn")
	private WebElement attendancebtn;
	
	@FindBy(id="idle-btn")
	private WebElement idlebtn;
	
	@FindBy(xpath="//label[.='Off']")
	private WebElement autoapprovebtn;

	@FindBy(xpath="//input[@class='multipleChecktimeclaim mr-4']")
	private WebElement alluserselected;
	
	@FindBy(id="actionButton")
	private WebElement actionbtn;
	
	@FindBy(xpath="(//span[.='×'])[8]")
	private WebElement declinedbtn;
	
	@FindBy(xpath="(//button[@class='btn btn-primary btn-block'])[1]")
	private WebElement timeclaimbtn;
	
	@FindBy(id="modalReasonShowOption")
	private WebElement timeclaimapprovebtn;
	
    @FindBy(xpath="(//button[@class='btn btn-secondary'])[3]")
    private WebElement cancilbtn;
	
    public TimeClaimModule1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAlluserselected() {
		return alluserselected;
	}

	public WebElement getAutoapprovebtn() {
		return autoapprovebtn;
	}
	
	public WebElement getActionbtn() {
		return actionbtn;
	}

	public WebElement getDeclinedbtn() {
		return declinedbtn;
	}

	public WebElement getIdlebtn() {
		return idlebtn;

	}

	public void setIdlebtn(WebElement idlebtn) {
		this.idlebtn = idlebtn;
	}

	
	public WebElement getCancilbtn() {
		return cancilbtn;
	}

	public WebElement getTimeclaimbtn() {
		return timeclaimbtn;
	}

	public WebElement getTimeclaimapprovebtn() {
		return timeclaimapprovebtn;
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

	public WebElement getTimeclaim1() {
		return timeclaim1;
	}

	public WebElement getDaterange() {
		// TODO Auto-generated method stub
		return daterange;
	}

	public WebElement getLastmonthbtn() {
		// TODO Auto-generated method stub
		return lastmonthbtn;
	}
	
	

	
}
