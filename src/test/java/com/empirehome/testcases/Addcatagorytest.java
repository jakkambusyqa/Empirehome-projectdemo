package com.empirehome.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EmpireHome.base.Testbase;
import com.empire.pageobjects.Addcatagory;
import com.empire.pageobjects.Addproduct;
import com.empire.pageobjects.Homepage;
import com.empire.pageobjects.Loginpage;
import com.empire.pageobjects.Movestock;

public class Addcatagorytest extends Testbase {

	Loginpage lp;
	Homepage homepage;
	Addproduct pro;
	 Movestock ms;
	Addcatagory catagory;
	
	
	public Addcatagorytest(){
		
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
		
		
	}
@Test

public void validateaddcatagory() throws Throwable{
	catagory.validatecatagory();
	
	
}
@AfterMethod
public void teardown(){
	driver.close();
}


}
