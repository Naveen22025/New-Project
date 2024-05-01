package com.EmpMonitor.genrics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.EmpMonitor.Pom.Dashboard;
import com.EmpMonitor.Pom.Logn;


public class BasePropCls {

	public WebDriver driver;
	public FileLib f= new FileLib();

	@BeforeClass()
	public void OpenBrowser() throws IOException {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	@AfterClass()
	public void CloseBrowser() {
		driver.close(); 
	}

	@BeforeMethod()
	public void Login() throws IOException {
		
		String url = f.Property("adurl");
		driver.get(url);
		String un = f.Property("adun");
		String pwd = f.Property("adpwd");
		Logn l = new Logn(driver);
		l.SetLogin(un, pwd);
		
	}

	@AfterMethod
	public void Logout()  {
		
		Dashboard d = new Dashboard(driver);
	    WebElement click = d.getImg();
	    f.Actiondouble(click, driver);
	    d.getLogout().click();		
		
		
	}
}

