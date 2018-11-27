package guru.SeleniumGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
	protected WebDriver driver;
  @Test
  public void f() throws InterruptedException
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Kawal\\tutorial\\Selenium\\chromedriver\\chromedriver.exe");  
	     driver=new ChromeDriver();  
	      
	    
	    String etitle= "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
	    String atitle= "";
	    
	    driver.get("http://www.guru99.com/");
	    
	    driver.manage().window().maximize();
	    
	    atitle=driver.getTitle();
	    
	    System.out.println(atitle);
	    
	    if(atitle.contentEquals(etitle))
	    	
	    {
	    	
	    	System.out.println("test case passed");
	    }
	    else{
	    	
	    System.out.println("test case failed");
	    
	    }
	    
	    
	    driver.close();
	    
	    
	  
	  
  }
}
