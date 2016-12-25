package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws Exception
	{
	
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.emirates.com/in/english/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
	WebElement	book=driver.findElement(By.xpath(".//*[@id='book']/a/span[1]"));
	WebElement	exp=driver.findElement(By.xpath(".//*[@id='inFlight']/a/span[1]"));
	
	Actions obj=new Actions(driver);
	Thread.sleep(3000);
	obj.moveToElement(book).moveToElement(exp).build().perform();
	System.out.println("move to success");

	}

}
