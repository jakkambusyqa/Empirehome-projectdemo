package com.empirehome.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EmpireHome.base.Testbase;
import com.empire.pageobjects.Addproduct;
import com.empire.pageobjects.Homepage;
import com.empire.pageobjects.Loginpage;

public class Addproducttest extends Testbase{

	Loginpage lp;
	Homepage homepage;
	Addproduct pro;
	
	
	
	public Addproducttest(){
		
		super();
		
		
	}
	
	
	@BeforeMethod 
	
	public void setup() throws Throwable{
		
		Initialization();
		lp=new Loginpage();
		lp.validatelogin();
		homepage=new Homepage();
	    pro=new Addproduct();
	}
	
	
	@Test
public void usertypetest() throws Throwable{
		pro.validateusertype();
	}
	
	@AfterMethod
	
	public void teardown(){
		
		driver.close();
	}
	
	
}
