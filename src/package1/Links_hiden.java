package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Links_hiden {

	public static void main(String[] args) throws Exception
	{//launch application with gecko  driver and add-ons
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		Thread.sleep(3000);
		//find all links and store into variable
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links count is--------"+links.size());
		int count =0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				//count all visible links
				count=count+1;
			}
		}
		System.out.println("visible links count is-----"+ count);
		System.out.println("Hidden links count is-----"+(links.size()-count));
	

	}

}
