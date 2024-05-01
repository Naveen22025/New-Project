package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.TimeClaimModule1;
import com.EmpMonitor.Pom.Timesheets;
import com.EmpMonitor.genrics.BasePropCls;

public class TestTimesheet extends BasePropCls{

	@Test(priority=3)
	public void timesheet() {
	Timesheets t = new Timesheets(driver);
	t.getTimesheet().click();
	f.SelectDrop(t.getTimesheetlocation(),"Dharwad");
	f.SelectDrop(t.getTimesheetdepartment(), "Php");
	t.getDaterange().click();
	t.getLastmonth().click();
	}
	
	
}
