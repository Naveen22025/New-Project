package com.EmpMonitor.test;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.Reports;
import com.EmpMonitor.genrics.BasePropCls;
@Listeners(com.EmpMonitor.genrics.ListnerImpl.class)
public class TestReports extends BasePropCls{

	@Test
	public void ReportDownload() {
		
		Reports r = new Reports(driver);
		
		r.getReport().click();
		r.getReportdownloadbtn().click();
		
		f.SelectDrop(r.getReportrolebtn(), "Employee");
		f.SelectDrop(r.getReportlocationbtn(), "banglore");
		f.SelectDrop(r.getReportdepartmentbtn(), "Testing");
		
		r.getReportdateranglebtn().click();
		r.getReportlast30daysbtn().click();
		
		f.SelectDrop(r.getReportdownloadoptbtn(), "All");
		
		r.getAlluserradiobtn();
		r.getViewreportbtn().click();

		f.HandleWindows(driver);
		f.Explicit(driver, r.getApphistorybtn(), Duration.ofSeconds(10));
		r.getApphistorybtn().click();
		
	}
}
