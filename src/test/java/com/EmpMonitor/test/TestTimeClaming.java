package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.TimeClaimModule1;
import com.EmpMonitor.genrics.BasePropCls;

@Listeners(com.EmpMonitor.genrics.ListnerImpl.class)
public class TestTimeClaming extends BasePropCls{

	
	@Test(priority=4)
	public void ClaimTest() throws InterruptedException {
		
		TimeClaimModule1 tcl = new TimeClaimModule1(driver);
		
	    tcl.getTimeclaim1().click();
	    tcl.getDaterange().click();
		tcl.getLastmonthbtn().click();
	    f.SelectDrop(tcl.getStatus(), "Approved");
		
		tcl.getOfflinebtn().click();
		tcl.getBreakbtn().click();
		tcl.getAttendancebtn().click();
		tcl.getIdlebtn().click();
		
		tcl.getTimeclaimbtn().click();
		
		Thread.sleep(2000);
		f.SelectDrop(tcl.getTimeclaimapprovebtn(), "Attendance");
		
		tcl.getCancilbtn().click();
		
		tcl.getAlluserselected().click();
		tcl.getActionbtn().click();
		tcl.getDeclinedbtn().click();
	}
}
