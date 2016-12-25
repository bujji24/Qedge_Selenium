package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//xpath creation of webtable
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		for (int i = 1; i <=10; i++)
		{
			for (int j = 1; j <=3; j++)
			{
				String x=d.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				System.out.print(x+"      ");
				
			}
			System.out.println();
		}
		

	}

}
