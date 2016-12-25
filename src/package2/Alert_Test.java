package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alert_Test {

	public static void main(String[] args) throws Exception
	{
		//launch application
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//click on find flights
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();//click on ok on alert()
		System.out.println("click on ok button on alert message");
        

		
		
		
		

	}

}
