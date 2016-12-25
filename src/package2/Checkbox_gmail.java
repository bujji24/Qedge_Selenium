package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_gmail {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		//d.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("shaidavali.sk");
		d.findElement(By.id("next")).click();
		Thread.sleep(3000);
	WebElement	box=d.findElement(By.id("PersistentCookie"));
	System.out.println(box.getAttribute("checked"));
	if (box.isSelected())
	{
		box.click();
		System.out.println(box.getAttribute("checked"));
		
	}
		
	

	}

}
