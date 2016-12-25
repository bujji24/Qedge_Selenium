package package1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_icici {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver d= new FirefoxDriver();
		d.get("https://icicibank.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//all links store into webelement
		List<WebElement> icicilinks=d.findElements(By.tagName("a"));
		System.out.println(icicilinks.size());//get size of all links
		for(int i=0;i<icicilinks.size();i++)
		{
		String str=icicilinks.get(i).getText();
		System.out.println(str);
		}
		d.quit();

	}

}
