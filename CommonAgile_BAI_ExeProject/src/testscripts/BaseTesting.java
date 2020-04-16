package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Scanner;
import org.testng.annotations.AfterClass;
import baseSrc.BaseClass;
import locators_and_func.Common_functionality;
import locators_and_func.In_Sprint_page;
import locators_and_func.Upto_Sprint_page;

public class BaseTesting extends BaseClass{
  
	private String url="https://pratesting.cognizant.com/";
	
	
	@Test
  public void openProject() throws InterruptedException {
 
		Upto_Sprint_page locate = new Upto_Sprint_page(driver);
		Thread.sleep(5000);
		locate.selectProject();
		locate.selectSprint();
		
	}
	
	
	
//Launching browser with url given
 	
	@BeforeClass
  public void startBrowser(){
  
  System.out.println("Choose browser from listed");
  System.out.println("1.Google Chrome\n"+"2.Mozilla Firefox\n"+"3.Internet Explorer");
  
  Scanner scan = new Scanner(System.in);
  int browser = scan.nextInt();
  scan.close();
  
  launchBrowser(browser,url);
  
  }
  

	
	
	
@AfterClass
  public void endBrowser() {
  }

}
