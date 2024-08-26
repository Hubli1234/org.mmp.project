package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageTitle {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page Title:" +pageTitle);
		System.out.println("Page Title :" +driver.getTitle());
		Thread.sleep(3000);
		driver.quit();



	}

}
