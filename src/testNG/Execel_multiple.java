package testNG;

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

public class Execel_multiple {
  @Test
  public void read_write() throws Exception
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("http://newtours.demoaut.com/");
	  d.manage().window().maximize();
	  Thread.sleep(5000);
	  FileInputStream file=new FileInputStream("F:\\selenium_qedge\\Excel\\Book2.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet ws=wb.getSheet("Sheet3");
	  Thread.sleep(3000);
	  Iterator<Row> row=ws.iterator();//multiple iteration on sheet
	  row.next();//moves next row
	  while (row.hasNext())
	  {
		  Row r = row.next();
		  Thread.sleep(3000);
		  d.findElement(By.linkText(r.getCell(0).getStringCellValue())).click();
		  String actUrl=d.getCurrentUrl();
		  r.createCell(2).setCellValue(actUrl);		
		  String expUrl=r.getCell(1).getStringCellValue();
		  if(actUrl.equals(expUrl)){
			  r.createCell(3).setCellValue("PAAS");
		  }
		  else {
			r.createCell(3).setCellValue("FAILED");
		}
		  d.navigate().back();
	}
	  //stores data into new file
	  FileOutputStream file1=new FileOutputStream("F:\\selenium_qedge\\Excel\\Book4.xlsx");
	  wb.write(file1);
	  file.close();
	  
  }
  
}
