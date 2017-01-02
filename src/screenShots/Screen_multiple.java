package screenShots;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_multiple {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			String linkname=links.get(i).getText();
			links.get(i).click();
			Thread.sleep(3000);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("F:\\selenium_qedge\\screenshots\\"+linkname+".png"));
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
	

	}

}
