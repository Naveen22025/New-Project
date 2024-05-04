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
import java.time.Duration;

import org.testng.annotations.Test;

import com.EmpMonitor.Pom.Employee;
import com.EmpMonitor.Pom.EmployeeAttendance;
import com.EmpMonitor.genrics.BasePropCls;


public class EmpAttendance extends BasePropCls{

	@Test(priority=2)
	public void EmployeAttendance() throws InterruptedException {
		
		Employee e= new Employee(driver);
		e.getEmployee().click();
		EmployeeAttendance att= new EmployeeAttendance(driver);
		att.getEmpattendance().click();
		Thread.sleep(2000);
		f.SelectDrop(att.getLocation(), "Bangalore");
		f.SelectDrop(att.getDepartment(), "Testing");
		
		att.getMonthbox().click();

		f.SelectDrop(att.getMonth(), "Mar");
		f.SelectDrop(att.getYear(), "2024");
		att.getDone().click();
		
		
		f.SelectDrop(att.getpagination(), "25");
		att.getSelecteuser().click();
		
		att.getTimesheets().click();
		f.Explicit(driver,att.getScreenshots(), Duration.ofSeconds(10));
		att.getScreenshots().click();
		f.Explicit(driver, att.getWebhistory(), Duration.ofSeconds(10));
		att.getWebhistory().click();
		f.Explicit(driver, att.getApphistory(), Duration.ofSeconds(10));
		att.getApphistory().click();
		f.Explicit(driver, att.getKeystroke(), Duration.ofSeconds(10));
		att.getKeystroke().click();

	}
}
