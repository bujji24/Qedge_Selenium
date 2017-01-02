package screenShots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_shot {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F:\\selenium_qedge\\screenshots\\image.png") );

	}

}
