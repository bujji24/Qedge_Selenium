package log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class JavaScriptExecutor {

	public static void main(String[] args) 
	{
		//click on hidden components
	FirefoxDriver d= new FirefoxDriver();
		d.get("http://bing.com");
		d.manage().window().maximize();
		Sleeper.sleepTightInSeconds(4);
		//identify the calendar hidden link under office link
		WebElement src=d.findElement(By.xpath(".//*[@id='officemenu_calendar_img']"));
	JavascriptExecutor	js =(JavascriptExecutor)d;
	js.executeScript("arguments[0].click()", src);
	System.out.println("click on hidden components");
	
	
		

	}

}
