package package1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Header_block {

	public static void main(String[] args) throws Exception 
	{
		//launch bing application
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//identify the header block and store
		WebElement block=driver.findElement(By.className("sw_tb"));
		//from header block identify links
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
		String	str=links.get(i).getText();
		System.out.println(str);
		}
		

	}

}
