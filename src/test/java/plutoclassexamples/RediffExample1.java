package plutoclassexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffExample1 {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Access the Chrome Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter the url:
				driver.get("https://money.rediff.com/gainers");
				
				String stockArray[]= {"Bharat Bijlee","Wheels India Ltd","Elixir Capital"};
				
				for(int i=0; i<stockArray.length; i++)
				{
					fetchStockDetails(stockArray[i]);
				}
	}
				
				public static void fetchStockDetails(String stockName)
				{
					
				//if stock is available
					
					System.out.println("----------Printing Stock Details for ---------" +stockName);
					
				try {
					
				
				
			if(driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]")).isDisplayed());	
			{
				
	//Fetch the stock details:	Bharat Bijlee, Wheels India Ltd,Elixir Capital	
				
   String group = driver .findElement(By.xpath("//a[contains(text(),"+stockName+")]/parent::td/following-sibling::td[1]")).getText();
   String prevclose = driver .findElement(By.xpath("//a[contains(text(),"+stockName+")]/parent::td/following-sibling::td[2]")).getText();
   String currprice = driver .findElement(By.xpath("//a[contains(text(),"+stockName+")]/parent::td/following-sibling::td[3]")).getText();
   String percentagechange = driver .findElement(By.xpath("//a[contains(text(),"+stockName+")]/parent::td/following-sibling::td[4]")).getText();
   
   System.out.println("Group Value::::" +group);
   System.out.println("prevclose Value::::" +prevclose);
   System.out.println("currprice Value::::" +currprice);
   System.out.println("precentagechange Value::::" +percentagechange);
   
   
   
   
	}
				
				} catch (Exception e) {

     System.out.println("prtint the stock name is not displayed in gainers list" +e.getMessage());
				}
	
	}
}
