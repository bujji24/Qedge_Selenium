package grid2;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider 
{
	@DataProvider(parallel=true)
  
  public Object[][] getData() 
	{
		Object[][] data=new Object[2][3];
		data[0][0]="Admin";
		data[0][1]="admin";
		data[0][2]="firefox";
		
		data[1][0]="Admin";
		data[1][1]="admin";
		data[1][2]="chrome";
		return data;
		
		
  }
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws MalformedURLException, Exception 
	{
		System.out.println(b);
		
		
		DesiredCapabilities cap=null;
		if (b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else if (b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN8_1);
			
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://professional.demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
	}
}
