package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window_Handles {
  @Test
  public void popup() throws Exception
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.saiservice.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  //it returns unique id of current window
	  String str1=driver.getWindowHandle();
	  System.out.println(str1);
	  //click on hyderabad link
	  driver.findElement(By.id("AcMn")).click();
	  Thread.sleep(3000);
	  //get mulptiple window unique ids
	  Set<String> str2=driver.getWindowHandles();
	  System.out.println(str2);
	  
	  Thread.sleep(3000);
	 Object a[]=str2.toArray();
	 String window=a[1].toString();
	 driver.switchTo().window(window);
	 Thread.sleep(3000);
	 driver.findElement(By.id("Nombre")).sendKeys("maruthi"); 
	 Thread.sleep(3000);
	 driver.close();
	 //switch popup to main window
	 
	 String main=a[0].toString();
	 driver.switchTo().window(main);
	 //click on contact list link in main window
	 driver.findElement(By.linkText("Contact Us")).click();
	 System.out.println("process finish");
	 
	  
  }
}
