package com.empirehome.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EmpireHome.base.Testbase;
import com.empire.pageobjects.Addproduct;
import com.empire.pageobjects.Homepage;
import com.empire.pageobjects.Loginpage;
import com.empirehom.utils.Utils;


public class Homepagetest extends Testbase {
	Loginpage lp;
	Homepage homepage;
	Addproduct pro;
	String sheetname="Sheet1";
	
	public Homepagetest(){
		
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
	
	
	@Test(priority=2)
	
	
	public void title()throws Throwable{
		
		String titlestest=homepage.titletest();
		Assert.assertEquals(titlestest, "Empire Home Admin Panel");
		
	}
	
	
	@DataProvider
	
	public Object[][] getcrmtestdata(){
		Object data [][]=Utils.getExcelData(sheetname);
		return data;
	}
	
    @Test (priority=1,dataProvider="getcrmtestdata")

    public void datacreatenew(String Modelnumber,String Itemtitle,String Itemdescription,String Height,String Width,String Breadth,String Colourname,String Actualprice,String Quantity) throws Throwable{

	homepage.adddata(Modelnumber, Itemtitle, Itemdescription, Height, Width, Breadth, Colourname, Actualprice, Quantity);
		
}


@AfterMethod

public void teardown(){
	driver.close();
	
}

}
