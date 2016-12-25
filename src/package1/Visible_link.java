package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Visible_link {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Thread.sleep(5000);
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				Thread.sleep(3000);
				String str=driver.getCurrentUrl();
				System.out.println(str);
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
		}
	
		
		
		
		
		

	}

}
