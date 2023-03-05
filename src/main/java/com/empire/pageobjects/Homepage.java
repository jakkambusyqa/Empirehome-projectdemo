package com.empire.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EmpireHome.base.Testbase;
import com.empirehom.utils.Utils;

public class Homepage extends Testbase{

	@FindBy (xpath="//i[@class='fa fa-houzz']")
	WebElement mouse;
	
	@FindBy (xpath="//a[text()='Add Inventory']")
	WebElement addinventory;
	
	@FindBy (name="ModelNumber")
	WebElement modelnum;
	
	@FindBy (name="Title")
	WebElement itemname;
	
	@FindBy (name="ItemDescription")
	WebElement itemdesc;
	
	@FindBy (name="Height")
	WebElement height;
	
	@FindBy (name="Width")
	WebElement width;
	
	@FindBy (name="Breadth")
	WebElement breadth;
	
	@FindBy (name="ColorName")
	WebElement colour;
	
	@FindBy (name="ActualPrice")
	WebElement price;
	
	@FindBy (name="MRPPrice")
	WebElement mrp;
	
	@FindBy (name="Qty")
	WebElement quantity;
	
	
	@FindBy (xpath="//button[text()=' Save']")
	WebElement buttonsave;
	
	@FindBy (name="ProductMainImageUploaded")
	WebElement file;
	
	
	public Homepage(){
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	public String titletest()throws Throwable{
		
		return driver.getTitle();
	}
	
	
	public Addproduct adddata(String modelnu,String Itemtit,String Itemdes,String Hei,
			String Wid,String Brea,String Colourname,String actprice,String Qty) throws Throwable{
		
		
	Thread.sleep(3000);
	Actions ac=new Actions(driver);
	ac.moveToElement(mouse).build().perform();
	
	
	
	addinventory.click();	
	modelnum.sendKeys(modelnu);
	itemname.sendKeys(Itemtit);
	itemdesc.sendKeys(Itemtit);	
	height.sendKeys(Hei);
	width.sendKeys(Wid);
	breadth.sendKeys(Brea);
	colour.sendKeys(Colourname);
	price.sendKeys(actprice);
	quantity.sendKeys(Qty);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", file);
	Utils.upload();
	return new Addproduct();
		
		
	}
	
	
	
	
	
	
	
}
