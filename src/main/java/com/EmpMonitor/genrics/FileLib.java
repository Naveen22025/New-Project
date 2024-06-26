package com.EmpMonitor.genrics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileLib {


		public String Property(String key) throws IOException {
			FileInputStream fis = new FileInputStream("./src/test/resources/data/Comm.properties");
			Properties p = new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}

		public String Getexcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {

			FileInputStream fis = new FileInputStream("./src/test/resources/data/Comm.properties");
		Workbook wb = WorkbookFactory.create(fis);
			String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			return value;

		}

		public void SetExcel(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException {

			FileInputStream fis = new FileInputStream("./src/test/resources/data/Comm.properties");
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);

			FileOutputStream fos = new FileOutputStream("./src/test/resources/data/Comm.properties");
			wb.write(fos);
			wb.close();

		}

		public void SelectDrop(WebElement element, String text) {

			Select s = new Select(element);
			s.selectByVisibleText(text);
		}

		public void SelectDropIn(WebElement element, int index) {

			Select s = new Select(element);
			s.selectByIndex(index);
		}
		
		public void Actionmove(WebElement move, WebDriver driver) {
			
			Actions a = new Actions(driver);
			a.moveToElement(move).perform();
		}
		
      public void Actiondouble(WebElement click, WebDriver driver) {
			
			Actions a = new Actions(driver);
			a.doubleClick(click).perform();
		} 
		
		public void Explicit(WebDriver driver, WebElement element, Duration i) {
			
			WebDriverWait wait = new WebDriverWait(driver, i);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		public void HandleWindows(WebDriver driver) {
			Set<String> Allwh = driver.getWindowHandles();
			Iterator<String> it = Allwh.iterator();
			String Parentwh = it.next();
			String Childwh = it.next();
			driver.switchTo().window(Parentwh);
			driver.close();
			driver.switchTo().window(Childwh);
		
			}
		}
		
	


