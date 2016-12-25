package keyword_fw;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginUsing_Properties {
  @Test
  public void f() throws Exception
  {
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  FileInputStream file=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\keyword_fw\\locators.properties");
	  Properties pr=new Properties();
	  pr.load(file);
	  driver.findElement(By.id(pr.getProperty("un"))).sendKeys("Admin");
	  driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys("admin");
	  driver.findElement(By.id(pr.getProperty("btn"))).click();
  }
}
