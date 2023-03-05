package com.empire.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EmpireHome.base.Testbase;

public class Loginpage extends Testbase{

	@FindBy (name="emailid")
	WebElement username;
	
	@FindBy (name="pword")
	WebElement password;
	
	@FindBy (xpath="//button[text()='Login']")
	WebElement button;
	
	
	
	
	public Loginpage() throws Throwable{
		
	PageFactory.initElements(driver,this);
	}
	
	
	public Homepage validatelogin(){
		
		
		
	username.sendKeys(prop.getProperty("username"));	
	password.sendKeys(prop.getProperty("password"));	
	button.click();
	
	return new Homepage();	
	}
	
    public String titletest()throws Throwable{
    	
    	return driver.getTitle();
    }

   }
	
	
    
