package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssSelector {
  @Test
  public void f() throws Exception 
  {
	 // System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  //creation of cssSelector
	  driver.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox")).sendKeys("book");
	  System.out.println("book sen into search box");
  }
}
