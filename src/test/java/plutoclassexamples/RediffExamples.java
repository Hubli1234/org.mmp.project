package plutoclassexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffExamples {
  static WebDriver driver;
  
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		
		// 1 access the Chrome Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2 Enter the url:
		driver.get("https://money.rediff.com/gainers");
		
		//4 if stock is available
		try {
			
		
		if(driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]")).isDisplayed())
		{
		
		//3 Fetch the stock details: India Cements Lt
	String group = driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/parent::td/following-sibling::td[1]")).getText();
	String prevClose = driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/parent::td/following-sibling::td[2]")).getText();
	String currPrice = driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/parent::td/following-sibling::td[3]")).getText();
	String percentageChange = driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/parent::td/following-sibling::td[4]")).getText();
	
	System.out.println("Group Value----" +group);
	System.out.println("prev Close Value----" +prevClose);
	System.out.println("Curr Price Value----" +currPrice);
	System.out.println("Percentage Change Value----" +percentageChange);
	
	}
		}
		catch(Exception e)
		{
			System.out.println("print the stock name is not displayed in gainers list" +e.getMessage());
		}
	}
}