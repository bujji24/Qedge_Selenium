package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;



import org.testng.annotations.AfterTest;

public class NewTest1  {
  @Test(priority=0)
  public void f() 
  {
	  System.out.println("FIRST");
  }
  @Test(priority=1)
  public void a() 
  {
      System.out.println("SECOND");

}
  @BeforeTest
  public void beforeMethod() 
  {
	 System.out.println("START"); 
  }

  @AfterTest
  public void afterMethod()
  {
	  System.out.println("STOP");
  }

}
