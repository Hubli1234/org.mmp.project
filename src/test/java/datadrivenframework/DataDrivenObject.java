package datadrivenframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenObject {
	
	//start with public void testData() after returning data the Method type will change to 2 dim object array
	//this approach good to test for limited data
	
	@DataProvider(name="wsdata")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "selauto1@test.com";
		data[0][1] = "pass@123";
		
		data[1][0] = "selauto2@test.com";
		data[1][1] = "pass@123";
		
		return data;
	}
	
	// above method will be a supplier of data to Test Method

	@Test(dataProvider = "wsdata")
	public void testLoginFunction(String username, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("username");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
}
