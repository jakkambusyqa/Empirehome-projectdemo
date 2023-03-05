package com.EmpireHome.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.empirehom.utils.Listeners;

    public class Testbase {

    public static Properties prop;
	public static WebDriver driver;
	
	public static EventFiringWebDriver e_driver;
	
	public static Listeners listener;
	
	public Testbase ()      {
		try {
		
		prop =new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\jakkam sairam\\workspace\\EmpireHome\\src\\main\\java\\com\\empires\\configprop\\congifprop");		
		prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Initialization(){
		
		String browsername=prop.getProperty("browser");	
		
		if(browsername.equals("chrome"))				
	    driver= new ChromeDriver();		
		
		if(browsername.equals("edge"))			
	    driver=new EdgeDriver();
	    
	
	 
	    e_driver=new EventFiringWebDriver(driver); 
	    listener = new Listeners();
	    e_driver.register(listener);
	    driver = e_driver;
    		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));		
		driver.manage().deleteAllCookies();	
		}					
        }