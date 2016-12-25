package package1;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
	    
	

	}

}
