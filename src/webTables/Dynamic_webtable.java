package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_webtable {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//xpath for webtable
		WebElement table=d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		//identify rows in webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
         System.out.println(rows.size());
         //loop for columns
         for (int i = 0; i <rows.size(); i++)
         {
        	 //identify columns in rows
        List<WebElement> cols	= rows.get(i).findElements(By.tagName("td"));
        System.out.println(cols.size());
        //loop for columns
        for (int j = 0; j <cols.size(); j++) 
        {
        	System.out.print(cols.get(j).getText()+"       ");
			
		}
        System.out.println("       ");
			
		}

	}

}
