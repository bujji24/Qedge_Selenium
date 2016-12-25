package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Download{
	@Test
	public void download() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("3.0.1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\selenium_qedge\\AutoIT\\Download.exe");
		

	}
}