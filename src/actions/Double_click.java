package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Double_click {
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dc=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(dc).build().perform();
		System.out.println("double click on lin");
  }
}
