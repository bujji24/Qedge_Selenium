package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Upload_autoit{
	@Test
	public void upload() throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("photo")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\selenium_qedge\\AutoIT\\Upload.exe");
	}
}