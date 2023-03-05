package com.empire.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EmpireHome.base.Testbase;

public class Addcatagory extends Testbase {
	
	@FindBy (xpath="//i[@class='fa fa-database']")
	WebElement mouses;
	
	@FindBy (xpath="//a[text()='Categories']")
	WebElement clickcatagory;
	
	@FindBy (xpath="//i[@class='fa fa-plus']")
     WebElement addcatagory;
	
	@FindBy (name="CategoryName")
    WebElement name;
	
	@FindBy (xpath="//button[@class='btn btn-success serchgaptop']")
	WebElement button;


	
	public Addcatagory (){
		
		PageFactory.initElements(driver, this);
	}
	
	public Movestock validatecatagory() throws Throwable{

		Actions ac=new Actions(driver);
		ac.moveToElement(mouses).build().perform();
		Thread.sleep(2000);
		clickcatagory.click();
		addcatagory.click();
		name.sendKeys(prop.getProperty("catagory"));
		button.click();
		
	
		return new Movestock();
	
	
	}
	


}


