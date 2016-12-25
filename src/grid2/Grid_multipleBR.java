package grid2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_multipleBR {
	@Parameters("browser")
  @Test
  public void multiple_br(String b) throws MalformedURLException, Exception 
  {
	  System.out.println(b);
	  DesiredCapabilities capb=null;
	  if(b.equals("firefox"))
	  {
		  capb=DesiredCapabilities.firefox();
		  capb.setBrowserName("firefox");
		  capb.setPlatform(Platform.WINDOWS);
	  }
	  if(b.equals("chrome"))
	  {
		  capb=DesiredCapabilities.chrome();
		  capb.setBrowserName("chrome");
		  capb.setPlatform(Platform.WINDOWS);
	  }
	  if(b.equals("iexplore"))
	  {
		  capb=DesiredCapabilities.internetExplorer();
		  capb.setBrowserName("iexplore");
		  capb.setPlatform(Platform.WINDOWS);
	  }
	  RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capb);
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Gmail")).click();
	  System.out.println("click on Gmail link ");
  }
}
