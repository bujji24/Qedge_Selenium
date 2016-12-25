package grid2;




import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class Grid_node1 {
 

@Test
  public void grid_Br1() throws MalformedURLException, Exception
  {
	  DesiredCapabilities capb=null;
	  capb=DesiredCapabilities.firefox();
	  capb.setBrowserName("firefox");
	  capb.setPlatform(Platform.WINDOWS);
	 

	  RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capb);
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(7000);
	  driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
  }
	
	

}
		
		
	  
  

