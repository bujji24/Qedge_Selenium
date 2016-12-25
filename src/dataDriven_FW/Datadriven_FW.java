package dataDriven_FW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Datadriven_FW {
  @Test
  public void f() throws Exception 
  {
	  //launch application
	  WebDriver d=new FirefoxDriver();
	  d.get("http://newtours.demoaut.com/");
	  d.manage().window().maximize();
	  Thread.sleep(5000);
	  //click on Register link
	  d.findElement(By.linkText("REGISTER")).click();
	  Thread.sleep(3000);
	  FileInputStream file=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\dataDriven_FW\\Datadriventesting.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet ws=wb.getSheet("Sheet3");
	Iterator<Row> row= ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r=row.next();
		d.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		d.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		d.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
		d.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		d.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		d.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		d.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		d.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
		d.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		d.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		d.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		d.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		d.findElement(By.name("register")).click();
		Thread.sleep(3);
		String actres=d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		String expres=r.getCell(9).getStringCellValue();
		if (actres.contains(expres)) 
		{
		   r.createCell(12).setCellValue("Passed");	
		}
		else
		{
			r.createCell(12).setCellValue("Failed");
		}
		
		d.navigate().back();
		
		
	}
	FileOutputStream f=new FileOutputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\dataDriven_FW\\Datadriventesting1.xlsx");
	  wb.write(f);
	  f.close();
  }
  
  
}
