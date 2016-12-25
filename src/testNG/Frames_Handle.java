package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frames_Handle {
  @Test
  public void frame() throws Exception 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://paytm.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000); 
	  //click  on login link
	  driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
	  Thread.sleep(3000);
	  List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	  System.out.println(frames.size());
	  driver.switchTo().frame(0);
	  Thread.sleep(3000);
	  driver.findElement(By.id("input_0")).sendKeys("rose.bujji24@gmail.com");
  }
}
