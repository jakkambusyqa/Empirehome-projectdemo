package com.empirehome.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EmpireHome.base.Testbase;
import com.empire.pageobjects.Addcatagory;
import com.empire.pageobjects.Addproduct;
import com.empire.pageobjects.Homepage;
import com.empire.pageobjects.Loginpage;
import com.empire.pageobjects.Movestock;

public class MovestockTest extends Testbase {

	Loginpage lp;
	Homepage homepage;
	Addproduct pro;
	 Movestock ms;
	Addcatagory catagory;
	Movestock emp;
	
	public MovestockTest(){
		
		super();
		
	}
	
	@BeforeMethod 
	
	public void setup() throws Throwable{
		
		Initialization();
		lp=new Loginpage();
		lp.validatelogin();
		homepage=new Homepage();
	    pro=new Addproduct();
	    ms=new Movestock();
	    catagory=new Addcatagory();
	    emp=new Movestock();
	}
	
	
	@Test 
	
	public void validatemovestock() throws Throwable{
		emp.movestockpage();
		
		
	}
	
	@AfterTest
	
	public void teardown(){
		
			driver.close();
		}

	}
	
	

