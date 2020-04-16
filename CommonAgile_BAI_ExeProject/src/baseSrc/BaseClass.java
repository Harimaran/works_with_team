package baseSrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	protected WebDriver driver;
	
	//location of drivers
	private static final String chromeDriver_location = "driver\\chromedriver.exe";
	private static final String FirefoxDriver_location = "driver\\geckodriver.exe";
	private static final String IEDriver_location = "driver\\IEDriver.exe";

	
	public void launchBrowser(int browser, String url) {
	
		try {
			switch(browser) {
			
			case 1:
				System.setProperty("webdriver.chrome.driver", chromeDriver_location);	
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("debuggerAddress", "localhost: 9222");
				driver = new ChromeDriver(options);
				break;
				
			case 2:
				System.setProperty("webdriver.gecko.driver", FirefoxDriver_location);
				driver = new FirefoxDriver();
				break;
				
			case 3:
				System.setProperty("webdriver.ie.driver", IEDriver_location);
				driver = new InternetExplorerDriver();
				break;
			
			default:
				System.out.println("Choose browser from listed");
				break;
			}
			
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		catch (Exception e) {
			System.out.println("Error might occured with driver");
		}
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}
