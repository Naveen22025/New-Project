package com.EmpMonitor.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logn {
	
	@FindBy(id="amember-login")
	private WebElement UserText;
	
	@FindBy(id="amember-pass")
	private WebElement PassText;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement Submit;

	public Logn(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void SetLogin(String username, String password) {
	
	UserText.sendKeys(username);
	PassText.sendKeys(password);
	Submit.click();
	
	}
	

}
