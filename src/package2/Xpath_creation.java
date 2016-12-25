package package2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_creation {

	public static void main(String[] args) throws Exception 
	{
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='gs_lc0']/input[@name='q']")).sendKeys("malimsha bhai");
	    System.out.println("malimsha bhai");
		
		

	}

}
