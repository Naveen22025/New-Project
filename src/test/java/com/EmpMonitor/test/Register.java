package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.Dashboard;
import com.EmpMonitor.Pom.Employee;
import com.EmpMonitor.genrics.BasePropCls;
import com.EmpMonitor.genrics.FileLib;

public class Register extends BasePropCls{

	
	@Test
	public void RegisterName() throws InterruptedException {
		
		System.out.println("Register User");
		
		Employee e = new Employee(driver);
		e.getEmployee().click();
		e.getEmpDetails().click();
		e.getRole();
		
		e.getLocations();
		
		e.getDept().click();
		e.getSeldept().click();
		
		Thread.sleep(3000);
		e.getExport().click();
		e.getShiftexport().click();
		Thread.sleep(3000);
		e.getSubmitexport();
		
		Thread.sleep(3000);
		e.getPagination();
		
		Thread.sleep(2000);
		e.getActive().click();
		Thread.sleep(2000);
		e.getSuspended().click();
		Thread.sleep(2000);
		e.getDeletehistory().click();
		Thread.sleep(2000);
		e.getClosehistory().click();
		
	}
}
