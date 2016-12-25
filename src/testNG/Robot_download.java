package testNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_download {
  @Test
  public void rb_download() throws Exception 
  {
	  WebDriver d=new FirefoxDriver();
	  d.get("http://www.seleniumhq.org/download/");
	  d.manage().window().maximize();
	  Thread.sleep(4000);
	  d.findElement(By.linkText("3.0.1")).click();
	  Thread.sleep(3000);
	  Robot robo=new Robot();
	  robo.keyPress(KeyEvent.VK_TAB);
	  robo.keyRelease(KeyEvent.VK_TAB);
	  robo.delay(2000);
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  
  }
}
