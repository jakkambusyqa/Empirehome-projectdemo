package com.empirehome.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EmpireHome.base.Testbase;
import com.empire.pageobjects.Homepage;
import com.empire.pageobjects.Loginpage;


public class Loginpagetest extends Testbase {

	Loginpage lp;
	Homepage homepage;
	
	public Loginpagetest() throws Exception {
		
		super();
		
		 
	}
	
	@BeforeMethod 
	
	public void Setup() throws Throwable{
		
		Initialization();
		lp=new Loginpage();
		
	}
        @Test
	public void validlogintest(){
		
		homepage=lp.validatelogin();
	}
        
        
        @Test	
	public void validatetitle() throws Throwable{
		
		 String title=lp.titletest();
	     Assert.assertEquals(title, "Divine Precincts");
	}
	

@AfterMethod

  public void teardown(){
	
	driver.close();
}


}
