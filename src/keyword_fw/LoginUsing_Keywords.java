package keyword_fw;

import java.io.FileInputStream;

import java.util.Iterator;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsing_Keywords {
  @Test
  public void logintest() throws Exception 
  {
	  Login_Keywords keys=new Login_Keywords();
	  FileInputStream file=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\qegde_selenium\\src\\keyword_fw\\LoginKeywords.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet  ws=wb.getSheet("Sheet1");
	  Iterator<Row> row=ws.iterator();
	  row.next();
	  while(row.hasNext())
	  {
		 Row r=row.next();
		String action=r.getCell(3).getStringCellValue();
		if (action.equals("launchBrowser"))
		{
			keys.launchBrowser();
			System.out.println("launch the browser");
		}
		else if (action.equals("navigate")) 
		{
		   keys.navigate();
		   System.out.println("navigate to URL");
		}
		else if (action.equals("enterUsername")) 
		{
			keys.enterUsername();
			System.out.println("enter the username into text box");
			
		}
		else if (action.equals("enterPassword"))
		{
		 keys.enterPassword();
		 System.out.println("enter password into text box");
		}
		else if (action.equals("clickLogin")) 
		{
		  keys.clickLogin();
		  System.out.println("click on login button");
		}
	  }
	 
  }
}

