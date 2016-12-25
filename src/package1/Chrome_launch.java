package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium_qedge\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
