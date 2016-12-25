package testNG;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_upload {
  @Test
  public void robot_upload() throws Exception 
  {
	  WebDriver d= new FirefoxDriver();
	  d.get("http://toolsqa.com/automation-practice-form/");
	  d.manage().window().maximize();
	  Thread.sleep(4000);
	 // d.findElement(By.id("photo")).click();
	 // Thread.sleep(2000);
	  //copy the file path
	  StringSelection path=new StringSelection("‪‪D:\\images\\myphotos\\New folder\\Camera\\bujji.jpg");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	  //click on browse button
	  d.findElement(By.id("photo")).click();
	  Thread.sleep(2000);
	  Robot robo=new Robot();
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  robo.delay(2000);
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_V);
	  robo.keyRelease(KeyEvent.VK_V);
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  robo.delay(5000);
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  robo.delay(5000);
	  System.out.println("file uploaded successfully");
	  
	  
  }
}
