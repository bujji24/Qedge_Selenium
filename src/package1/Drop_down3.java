package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_down3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		//find out drop down
		WebElement drop=driver.findElement(By.name("country"));
		Thread.sleep(3000);
		List<WebElement> items=drop.findElements(By.tagName("option"));
		System.out.println("total items are==" + items.size());
		Thread.sleep(10000);
		
		for(int i=0;i<items.size();i++)
		{
			
			
			String str=items.get(i).getText();
			items.get(i).click();
			if(items.get(i).isSelected())
			{
				System.out.println(str +"is active");
			}
			else
			{
				System.out.println(str +"is in active");
			}
			
		}
	

	}

}
