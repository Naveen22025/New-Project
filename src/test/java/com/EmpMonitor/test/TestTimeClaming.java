package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.TimeClaimModule1;
import com.EmpMonitor.genrics.BasePropCls;

public class TestTimeClaming extends BasePropCls{

	
	@Test
	public void ClaimTest() {
		
		TimeClaimModule1 tcl = new TimeClaimModule1(driver);
		tcl.getTimeclaim().click();
		tcl.getDaterange().click();
		tcl.getLastmonthbtn().click();
		f.SelectDrop(tcl.getStatus(), "Approved");
		
		tcl.getOfflinebtn().click();
		tcl.getBreakbtn().click();
		tcl.getAttendancebtn().click();
		
		tcl.getTimeclaimbtn().click();
		
		f.SelectDrop(tcl.getTimeclaimapprovebtn(), "Attendance");
		
		tcl.getCancilbtn().click();
	}
}
