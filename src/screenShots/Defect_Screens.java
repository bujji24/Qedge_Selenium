package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Defect_Screens {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String expres="OrangeHRM";
	    String	actres=d.getTitle();
	    System.out.println("the actual title is=="+actres);
	    if(expres.equals(actres))
	    {
		    System.out.println("launch success");
	    }
	    else
	    {
		    System.out.println("launch not success");
		    File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src,new File("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\screenShots\\defectScreen.png"));
				  
	    }

	}

}
