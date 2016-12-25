package keyword_fw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Keywords 
{ 
	static FileInputStream f;
	WebDriver driver;
	public void launchBrowser ()
	{
	driver=new FirefoxDriver();
	}
	public void navigate() throws Exception
	{
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
    public void enterUsername() throws IOException
    {
    	f=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\keyword_fw\\locators.properties");
    	Properties pr=new Properties();
    	pr.load(f);
    	driver.findElement(By.id(pr.getProperty("un"))).sendKeys("Admin");
    }
    public void enterPassword() throws IOException
    {
    	f=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\keyword_fw\\locators.properties");
    	Properties pr=new Properties();
    	pr.load(f);
    	driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys("admin");
    }
    public void clickLogin() throws IOException
    {
    	f=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\keyword_fw\\locators.properties");
    	Properties pr=new Properties();
    	pr.load(f);
    	driver.findElement(By.id(pr.getProperty("btn"))).click();
    }
}
