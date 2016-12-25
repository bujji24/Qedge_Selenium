package package1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_profile {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium");
				
		WebDriver d=new FirefoxDriver(fp);
		d.get("http://google.com");
		d.manage().window().maximize();
		System.out.println("Add_ons installed");
		
		

	}

}
