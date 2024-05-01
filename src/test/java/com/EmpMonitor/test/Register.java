package com.EmpMonitor.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

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

import com.EmpMonitor.Pom.Dashboard;
import com.EmpMonitor.Pom.Employee;
import com.EmpMonitor.genrics.BasePropCls;
import com.EmpMonitor.genrics.FileLib;

public class Register extends BasePropCls{

	
	@Test(priority=1)
	public void RegisterName() throws InterruptedException {
		
		System.out.println("Register User");
		
		Employee e = new Employee(driver);
		e.getEmployee().click();
		e.getEmpDetails().click();
		f.SelectDrop(e.getRole(), "Employee ");
		
		f.SelectDrop(e.getLocations(), "Bangalore");
		
		e.getDept().click();
		e.getSeldept().click();
		
		f.Explicit(driver, e.getExport(), Duration.ofSeconds(10));
		e.getExport().click();
		e.getShiftexport().click();
		f.Explicit(driver, e.getSubmitexport(), Duration.ofSeconds(10));
		e.getSubmitexport();
		
		
		e.getPagination();
		
		f.Explicit(driver, e.getActive(), Duration.ofSeconds(10));
		e.getActive().click();
		f.Explicit(driver, e.getSuspended(), Duration.ofSeconds(10));
		e.getSuspended().click();
		
		
	}
}
