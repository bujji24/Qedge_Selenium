package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		d.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		d.findElement(By.id("lst-ib")).clear();
		d.findElement(By.id("lst-ib")).sendKeys("bujji");
		System.out.println("bujji printed successfully");
		d.close();
		

	}

}
