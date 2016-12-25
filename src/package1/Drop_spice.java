package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_spice {

	public static void main(String[] args) throws Exception 
	{//launch application
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//identifies the elements on web application through locators
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(" Hyderabad (HYD)")).click();
		driver.findElement(By.linkText(" Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("20")).click();
		//select the text from  drop down 
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));		
		Select sle=new Select(drop);
		sle.selectByVisibleText("2 Adults");
		//select the text from childern drop down
	/* drop2=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	Select sl=new Select(drop);
	sl.selectByVisibleText("2 Adults");*/
	//click on find flights
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	Thread.sleep(3000);
	System.out.println("finding flights");
	
	;
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
