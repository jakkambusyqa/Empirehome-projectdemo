package com.empire.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.EmpireHome.base.Testbase;
import com.empirehom.utils.Utils;

public class Movestock extends Testbase {
	
	@FindBy (xpath="//i[@class='fa fa-houzz']")
	WebElement mouse;
	
	@FindBy (xpath="//a[text()='Move Stock']")
	WebElement move;
	
	@FindBy (name="MovedFrom")
	WebElement from;
	
	@FindBy (name="MovedTo")
	WebElement to;
	
	@FindBy (name="Remarks")
	WebElement remark;
	
	@FindBy (id="invId")
	WebElement model;
	
	@FindBy (name="Qty1")
    WebElement qty;
	
	@FindBy (id="btnAdd")
	WebElement add;
	
	@FindBy (id="btnSave")
	WebElement save;
	
	
	public Movestock(){
		
		PageFactory.initElements(driver, this);
				
	}
	
	public empreg movestockpage() throws Throwable{
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		
		
		ac.moveToElement(mouse).build().perform();
		Thread.sleep(2000);
		move.click();
		
		
		Utils.dropdown(from, "Warehouse");
				
		Utils.dropdown(to, "Showroom");
		
		remark.sendKeys("sale approved");
		
		Thread.sleep(2000);
		Utils.dropdown(model, "54321");
		
		qty.clear();
		qty.sendKeys("1");
		add.click();
		save.click();
		
		return new empreg();
		
		
		
		
		
		
		
		
		
		
	}
	
}
