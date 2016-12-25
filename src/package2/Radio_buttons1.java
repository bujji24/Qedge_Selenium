package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_buttons1 {

	public static void main(String[] args) throws Exception
	{
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//loop for two groups
 		for (int k = 1; k<=2; k++) 
 		{
		List<WebElement>	radios=d.findElements(By.name("group"+k));
		//loop for radio buttons
		for (int i = 0; i < radios.size(); i++)
		{
			radios.get(i).click();
			//loop for print radio buttons values
			for (int j = 0; j < radios.size(); j++) 
			{
				System.out.println(radios.get(j).getAttribute("value")+"--------"+radios.get(j).getAttribute("checked"));
				
				
			}
			System.out.println("#######");
			
		}
		}
	}

}
