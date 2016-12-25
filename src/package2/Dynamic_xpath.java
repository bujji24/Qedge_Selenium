package package2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_xpath {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='UHSearchBox']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> items=driver.findElements(By.xpath("//*[contains(@id,'ui_3_12_0_1_1479')]/a "));
		
		System.out.println(items.size());
		items.get(0).click();
		Thread.sleep(5000);
		System.out.println("click on selenium tutorial");
		

	}

}
