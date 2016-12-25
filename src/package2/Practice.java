package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement block=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checks=block.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	    for (int i = 0; i < checks.size(); i++) 
	    {
	    	if (!checks.get(i).isSelected())
	    	{
				checks.get(i).click();
				System.out.println(checks.get(i).getAttribute("value")+"-----"+checks.get(i).getAttribute("checked"));
				System.out.println("######");
			}
			
		}

	}

}
