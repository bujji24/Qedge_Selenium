package log4j;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Cookies_Testing {

	public static void main(String[] args) {
		
		WebDriver d= new FirefoxDriver();
		d.get("http://gmail.com");
		d.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		Set<Cookie> mycookies=d.manage().getCookies();
		System.out.println(mycookies.size());
		Iterator<Cookie> it=mycookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"-------"+c.getValue()+"------"+c.getDomain());
		}
		  d.manage().deleteAllCookies();
		  Sleeper.sleepTightInSeconds(2);
		  mycookies =d.manage().getCookies();
		  System.out.println(mycookies.size());
		}
		
		

	}


