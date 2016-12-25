package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_launch {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver d= new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//client expection page title
		String exp="OrangeHRM";
		//while exection get the page title
		String actual=d.getTitle();
		
		System.out.println(actual);
		if(exp.equals(actual))//comparision titles
		{
			System.out.println("launch success");
		}
		else
		{
			System.out.println("launch not success");
		}
		//login with valid data
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		//client expection
		String exps="Welcome Admin";
		//while login through tool
		String actlogin=d.findElement(By.id("welcome")).getText();
		System.out.println(actlogin);
		//comparision
		if(exps.equalsIgnoreCase(actlogin))
		{
			System.out.println("login success");
		}
		else
		{
			System.out.println("login not success");
		}
		
	

	}

}
