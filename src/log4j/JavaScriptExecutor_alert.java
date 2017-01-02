package log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class JavaScriptExecutor_alert 
{
  public static void main(String[] args)
  {
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\chromedriver.exe");
	 // ChromeDriver d= new ChromeDriver();
	  FirefoxDriver d= new FirefoxDriver();
	  d. get("http://google.com");
	  d.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(4);
	  JavascriptExecutor js= (JavascriptExecutor)d;
	  js.executeScript("alert('Hello');");
	  Sleeper.sleepTightInSeconds(3);
	 Alert alert =d.switchTo().alert();
	 alert.accept();
	  
  }
}
