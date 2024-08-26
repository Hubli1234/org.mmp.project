package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10) );
	   wait.until(ExpectedConditions.titleContains("Log in"));
	    driver.findElement(By.id("Email")).sendKeys("xyz@email.com");
	    

	}

}
