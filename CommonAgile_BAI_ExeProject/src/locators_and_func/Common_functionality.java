package locators_and_func;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Common_functionality{

	WebDriver driver;
	Actions action;
	
	public Common_functionality(WebDriver driver) {
		this.driver =driver;
	}

	By Iframe = By.xpath("//iframe[@id='contentframe']");
	By add = By.xpath("//div[@id='ASPRNT-GridToolbar-innerCt']/div/a");
	By save = By.xpath("//input[@id='SaveBtn']");
	By saveAdd = By.xpath("//input[@id='SaveAddNewBtn']");
	By rtn = By.xpath("(//td[@class='EformButtonSpacing'])[4]/input");
	By datePicker = By.xpath("//table[@class='ui-datepicker-calendar']/tbody//tr/td");
	

	public void switchFrame() {
		WebElement Frame = driver.findElement(Iframe);
		driver.switchTo().frame(Frame);
		
	}
	
	public void addSprint() throws InterruptedException {

		Thread.sleep(4000);
		driver.findElement(add).click();
		
	}

public void pickDate(int pick) throws InterruptedException {
		
		List<WebElement> list = new ArrayList();
		list = driver.findElements(datePicker);
		
		for(WebElement date : list) {
				if(date.getText().equals(Integer.toString(pick))) {
				date.click();
			}				
		}
	}
	
	
	public void clickSave() {
		WebElement SaveBtn = driver.findElement(save);
		SaveBtn.click();
	}
	
	public void clickSaveAdd() {
		
		WebElement SaveAdd = driver.findElement(saveAdd);
		SaveAdd.click();
	}
	
	
	public void clickReturn() throws InterruptedException {
		
		WebElement clickRtn = driver.findElement(rtn);
		clickRtn.click();
		driver.switchTo().alert().accept();
	}
	
}
