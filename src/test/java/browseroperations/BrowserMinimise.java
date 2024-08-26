package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMinimise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.manage().window().minimize();
		driver.get("https://www.selenium.dev/");
		System.out.println("Page Title" +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://amazon.com/");
		System.out.println("Page Title" +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();

	}

}
