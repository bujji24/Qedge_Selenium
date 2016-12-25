package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_down2 {

	public static void main(String[] args) throws Exception 
	{
		//launch application
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		//find out the drop down list & store
		WebElement drop=driver.findElement(By.name("country"));
		//find all elements in drop down box with tagname 'option'
		List<WebElement> items=drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		for(int i=0;i<items.size();i++)
		{
			//print the text of the every element*
		String str=items.get(i).getText();
		System.out.println(str);
		}
		
		

	}

}
