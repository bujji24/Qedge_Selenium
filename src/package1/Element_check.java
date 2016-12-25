package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_check{
	
		public static void main(String[] args) throws Exception 
		{
			//launc application
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   //navigate to url
		   driver.get("http://google.com");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   //get the source code of the page
		   String src=driver.getPageSource();
		   System.out.println("source code is==="+src);
		   //check the element is exist or not
		   if(src.contains("google"))
		   {
			   System.out.println("element is exist");
		   }
		   else
		   {
			   System.out.println("element is not found");
		   }
	}

}
