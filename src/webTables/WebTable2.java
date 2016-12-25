package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable2 {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//xpath for webtable
		//WebElement table=d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[5]/a";
		for (int i = 1; i<=36; i++) 
		{
		String	x=d.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(x);
			
		}

	}

}
