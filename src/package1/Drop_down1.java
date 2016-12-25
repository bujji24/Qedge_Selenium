package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Drop_down1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium");
		WebDriver d= new FirefoxDriver(fp);
		d.get("http://amazon.in");
		Thread.sleep(3000);
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		d.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		System.out.println("search for java");
		Thread.sleep(2000);
		d.quit();
		

	}

}
