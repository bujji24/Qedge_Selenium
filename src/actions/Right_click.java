package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
	    WebElement link=driver.findElement(By.linkText("Gmail"));
	    
	    
	    //builder.contextClick(link).sendKeys("w").build().perform();
	    builder.doubleClick(link).build().perform();
	    System.out.println("right click on gmail link");

	}

}
