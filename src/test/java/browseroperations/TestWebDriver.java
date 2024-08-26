package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver;
		
		System.out.println("Test Execution By ChromeDriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.quit();
        
        System.out.println("Test Execution By FireFoxDriver");
        driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("Test Execution By EdgeDriver");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.com/");
		Thread.sleep(3000);
		driver.close();
	}

}
