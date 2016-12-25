package package1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie_launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","F:\\selenium_qedge\\IEDriverServer\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		

	}

}
