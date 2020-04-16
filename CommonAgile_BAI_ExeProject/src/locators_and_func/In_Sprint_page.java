package locators_and_func;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class In_Sprint_page extends Common_functionality {

	Actions action;

	int PickEnd = 30;
	int pickStart = 20;

	public In_Sprint_page(WebDriver driver) {
		super(driver);
	}

	By name = By.xpath("//input[@name='CM_Name']");
	By description = By.xpath("//textarea[@id='DN_Description']");
	By sprintType = By.xpath("//option[text()=' Sprint 0 ']");
	By resp = By.xpath("//select[@id='DN_Responsibility']");
	By team = By.xpath("//input[@id='DN_NoofTeamsinvolved']");
	By release = By.xpath("//select[@name='CM_Release']");
	
	//calender
	By scalender = By.xpath("//span[@id='cal_STARTDATE']");
	By ecalender= By.xpath("//span[@id='cal_ENDDATE']");
	
	
	
	public void fillingData() throws InterruptedException {
		
		switchFrame();
		
		WebElement Name = driver.findElement(name);
		Name.sendKeys("Name");
		
		WebElement Description = driver.findElement(description);
		Description.sendKeys("Basic module");

		WebElement StartDate = driver.findElement(scalender);
		StartDate.click();
		pickDate(pickStart);

		
		WebElement EndDate = driver.findElement(ecalender);
		EndDate.click();
		pickDate(PickEnd);

		WebElement Responsibility = driver.findElement(resp);
		Select select = new Select(Responsibility);
		select.selectByIndex(2);

		WebElement Team = driver.findElement(team);
		Team.sendKeys("5");
			
		clickSave();
	}
	
	
}
