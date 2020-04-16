package locators_and_func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Upto_Sprint_page {
	
	WebDriver driver;
	Actions action;
	
	public Upto_Sprint_page(WebDriver driver){
		this.driver = driver;
	}
	
	By home = By.xpath("//span[@class='icon-leftMeuOpen close_menu']");
	By ProjectName = By.xpath("//*[text()='7digit emp id_exe proj']");
	By plan = By.xpath("(//ul[@class='ux-menu-ul'])[1]/li[2]/a");
	By sprint = By.xpath("//a[text()='Sprints']");
	
	
	public void selectProject() throws InterruptedException {
		Thread.sleep(3000);
		WebElement selectHome = driver.findElement(home);
		
		//To home
		action = new Actions(driver);
		action.moveToElement(selectHome).build().perform();
	
		//clicking project
		WebElement selectProjectName = driver.findElement(ProjectName);
		action.moveToElement(selectProjectName).click().perform();
		
	}
	
	//clicking sprint
	public void selectSprint() throws InterruptedException {
		Thread.sleep(10000);
		WebElement planTab = driver.findElement(plan);
		action.moveToElement(planTab).perform();
		
		WebElement sprintTab = driver.findElement(sprint);
		sprintTab.click();
		
	}
	
}
