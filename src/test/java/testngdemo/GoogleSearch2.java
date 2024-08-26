package testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority = 1)
	public void testserachBollywoodStar()
	{
		String expected = "Ranveer - Google Search";
		driver.findElement(By.name("q")).sendKeys("Ranveer",Keys.ENTER);
		String actual = driver.getTitle();
		System.out.println("Page Title" +actual);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2,enabled = false)
	 public void testsearchHollywoodStar()
	 {
		 driver.findElement(By.name("q")).sendKeys("Ryan",Keys.ENTER);
			String title = driver.getTitle();
			System.out.println("Page Title" +title); 
	 }
	 
	@Test(priority = 3, enabled = false)
	 public void testSearchTollywood()
	 {
		 driver.findElement(By.name("q")).sendKeys("AluArjun",Keys.ENTER);
			String title = driver.getTitle();
			System.out.println("Page Title" +title); 
}
}
