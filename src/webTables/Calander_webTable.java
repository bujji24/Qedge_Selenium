package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calander_webTable {
  @Test
  public void date_pick() throws Exception 
  {
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\chromedriver.exe");
//	ChromeDriver driver=new ChromeDriver();
      WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.cleartrip.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	  driver.findElement(By.id("ToTag")).sendKeys("Goa, IN - Dabolim Airport (GOI)");
	  //click on date calendar
	  driver.findElement(By.xpath(".//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
	  System.out.println("click on date calender");
	  Thread.sleep(3000);
	  //user defined date
	  String date="10/08/2017";
	  String a[]=date.split("/");
	  String day=a[0];
	  String year= a[2];
	  String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
      int x=Integer.parseInt(a[1]);
      String month=months[x-1];
      //identify the year in calendar
      String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
      while (!calyear.equals(year)) 
      {
    	  //click on arrow in calendar
    	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
          calyear=driver.findElement(By.className("ui-datepicker-year")).getText();

      }
      // identify the month in calendar
      String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
      while (!calmonth.equals(month)) 
      {
    	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
    	  Thread.sleep(3000);
    	  calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	 }
      //webTable operation to pick day from calendar
     WebElement table=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table"));
     //identify rows
     List<WebElement> rows=table.findElements(By.tagName("tr"));
     System.out.println(rows.size());
     //loop for rows
     for (int i = 0; i < rows.size(); i++) 
     {
		//from row get no:of columns
    	List<WebElement>  cols=rows.get(i).findElements(By.tagName("td"));
    	//loop for columns
    	for (int j = 0; j <cols.size(); j++)
    	{
    		if(cols.get(j).getText().equals(day))
    		{
    			//click matching date
    			cols.get(j).click();
    			break;
    			
    		}
			
		}
	}
     Thread.sleep(5000);
     //click on SearchFlights
     driver.findElement(By.id("SearchBtn")).click();
     System.out.println("pick the user defined date successfully");
     driver.close();
  }
  
}
