package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compare_Screens {

	public static void main(String[] args) throws IOException 
	{
	   FirefoxDriver d= new FirefoxDriver();
	   d.get("http://newtours.demoaut.com");
	   d.manage().window().maximize();
	   d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  d.get("http://google.com");
	  File src2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  if(FileUtils.contentEquals(src, src2))
	  {
		  System.out.println("Screens are same");
	  }
	  else
		  
	  {
		  System.out.println("Screens are not same");
	  }

	}

}
