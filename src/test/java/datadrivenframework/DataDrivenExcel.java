package datadrivenframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtil;

   
public class DataDrivenExcel {
	
	WebDriver driver;

	@DataProvider(name="wsdata")
	public Object[][] testData()
	{
		ExcelUtil xl = new ExcelUtil("./src/test/resources/testdata/webshopdata.xlsx");
		int rows = xl.getRowCount(0);
		
		Object[][] data = new Object[rows][2];
		
		for(int i=0; i<rows; i++)
		{
			data[i][0] = xl.getCellData(0, i, 0);
			data[i][1] = xl.getCellData(0, i, 1);
		}	
		
		return data;
	}
	
	@BeforeMethod
	public void setUp()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
        driver.quit();
	}
	
	@Test(dataProvider = "wsdata")
	public void testLoginFunction(String username, String password)
	{
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("username");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
