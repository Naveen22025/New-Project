package com.EmpMonitor.genrics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.EmpMonitor.Pom.Dashboard;
import com.EmpMonitor.Pom.Logn;


public class BasePropCls {

	public WebDriver driver;
	public FileLib f= new FileLib();

	@BeforeTest()
	public void OpenBrowser() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest()
	public void CloseBrowser() {
		driver.close(); 
	}

	@BeforeMethod()
	public void Login() throws IOException {
		
		String url = f.Property("adurl");
		String un = f.Property("adun");
		String pwd = f.Property("adpwd");
		driver.get(url);
		Logn l = new Logn(driver);
		l.SetLogin(un, pwd);
		
	}

	@AfterMethod
	public void Logout()  {
		
		Dashboard d = new Dashboard(driver);
	    WebElement click = d.getImg();
	    f.Action(click, driver);
	    d.getLogout().click();
		
		
		
	}
}

