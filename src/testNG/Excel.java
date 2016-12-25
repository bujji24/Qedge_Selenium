package testNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel {
  @Test
  public void fff() throws Exception
  {
	
	  WebDriver d=new FirefoxDriver();
	  d.get("http://professional.demo.orangehrmlive.com/auth/login");
	  d.manage().window().maximize();
	  Thread.sleep(5000);
	  FileInputStream file= new FileInputStream("F:\\selenium_qedge\\Excel\\Book1.xlsx");
	   XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  d.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
	  d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());;
	  d.findElement(By.id("btnLogin")).click();
	  System.out.println("click on login button");
  }
}

