package com.EmpMonitor.genrics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpl extends BasePropCls implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		TakesScreenshot s = (TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("Screenshot1/"+name+"ss.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
		driver.close();
		
	}
	
	

	
}
