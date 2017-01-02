package log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitiyWait {

	public static void main(String[] args) 
	{
		WebDriver d= new FirefoxDriver();
		d.get("http://google.com");

         d.manage().window().maximize();
         d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         d.findElement(By.id("lst-ib")).sendKeys("selenium");
         
		

	}

}
