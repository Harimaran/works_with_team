package testscripts;

import org.testng.annotations.Test;

import locators_and_func.In_Sprint_page;

public class TestScenario1 extends BaseTesting{
	
	@Test
	public void sprint() throws InterruptedException {
		
		
		In_Sprint_page sprint = new In_Sprint_page(driver);
		sprint.addSprint();
		
		Thread.sleep(3000);		
		sprint.fillingData();
	}
	
}
