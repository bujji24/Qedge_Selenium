package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_boxs {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//xpath of check block
		WebElement checkblock=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		//creation xpath of check boxes
		List<WebElement> check=checkblock.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(check.size());
		//loop for check boxes
		for (int i = 0; i <check.size(); i++)
		{//condition checking
			if (!check.get(i).isSelected())
			{
				check.get(i).click();
				System.out.println(check.get(i).getAttribute("value"));
				System.out.println(check.get(i).getAttribute("checked"));
			}
			
		}
		

	}

}
