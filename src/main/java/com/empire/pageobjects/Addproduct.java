package com.empire.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EmpireHome.base.Testbase;


public class Addproduct extends Testbase {

	@FindBy (xpath="//i[@class='fa fa-database']")
	WebElement mouses;
	
	@FindBy (xpath="//a[text()='User Types']")
	WebElement clickusertype;
	
	@FindBy (xpath="//a[normalize-space()='Add New']")
	WebElement addnew;
	
	@FindBy (name="TypeName")
	WebElement name;
	
	@FindBy (name="TypeCode")
	WebElement type;
	
	@FindBy (xpath="//button[text()=' Save']")
	WebElement button;
	
	
	public Addproduct(){
		
	PageFactory.initElements(driver, this);	
				
	}
		
	public Addcatagory validateusertype() throws Throwable{
		
		Thread.sleep(3000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(mouses).build().perform();
		
		clickusertype.click();
		
		Thread.sleep(2000);
		addnew.click();
		
	
		name.sendKeys("Cto");
		type.sendKeys("2");
		
		button.click();
		
		return new Addcatagory();
	}
	
}
