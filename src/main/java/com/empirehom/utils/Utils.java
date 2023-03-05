package com.empirehom.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.EmpireHome.base.Testbase;

public class Utils extends Testbase {

	public static String images="D:\\jakkam sairam\\Downloads\\pic.webp";

	
	public Utils() {
		super();
	}

	public static String TESTDATA_EXCEL_PATH = "C:\\Users\\jakkam sairam\\workspace\\EmpireHome\\src\\main\\java\\com\\empireho\\testdata\\recliner.xlsx";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getExcelData(String sheetname) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_EXCEL_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} 
		catch (IOException e) {
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				DataFormatter df=new DataFormatter();
				
				data[i][k] = df.formatCellValue(sheet.getRow(i + 1).getCell(k));	
				
	}
	}
		return data;
	}

	
	public static void upload() throws Throwable{
		
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection(images);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	
	public  static void dropdown(WebElement element,String str){
		
		Select sel=new Select(element);
		sel.selectByVisibleText(str);
		
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	
}
	
	
	
	}
	
	
	


