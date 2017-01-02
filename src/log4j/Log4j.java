package log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {

	
		// TODO Auto-generated method stub
		// create logger object
		private static Logger log= Logger.getLogger(Log4j.class);
		public static void main(String[] args)
		{
		  DOMConfigurator.configure("log4j.xml");
		  FirefoxDriver d= new FirefoxDriver();
		  log.info("browser launched");
		  d.get("http://newtours.demoaut.com");
		  log.info("navigated to url");
		  d.findElement(By.name("userName")).sendKeys("admin");
		  log.info(" enter username");
		  d.findElement(By.name("password")).sendKeys("admin");
		  log.info("enter password");
		  d.findElement(By.name("login")).click();
		  log.info("click on signin");

	}

}