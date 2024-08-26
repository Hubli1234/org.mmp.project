
package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void TestSearchSelenium() {
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		
				
	}
	
	@Test(priority = 2)
	public void TestSearchAppium() {
		driver.findElement(By.name("q")).sendKeys("Appium",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		
				
	}

	@Test(priority = 3)
	public void TestSearchCypress() {
		
		driver.findElement(By.name("q")).sendKeys("Cypress",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		
				
	}
}
