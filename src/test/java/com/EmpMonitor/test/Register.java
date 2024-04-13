package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.EmpMonitor.Pom.Dashboard;
import com.EmpMonitor.genrics.BasePropCls;

public class Register extends BasePropCls{

	
	@Test
	public void RegisterName() {
		
		System.out.println("Register User");
		
		Dashboard d= new Dashboard(driver);
		d.getEmployee().click();
		d.getEmpDetails().click();
	}
}
