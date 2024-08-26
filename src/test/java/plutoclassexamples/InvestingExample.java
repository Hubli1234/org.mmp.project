package plutoclassexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvestingExample {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//1 access the Chrome Browser
		
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2 enter url
        driver.get("https://www.investing.com/equities/top-stock-gainers");
        
        String stockArray[]= {"BlackBerry","Sobr Safe","Kala Pharma","Staffing 360"};
        
        for(int i=0; i<stockArray.length;i++)
        {
        	fetchStockDetails(stockArray[i]);
        }
	}
        
        public static void fetchStockDetails(String stockName)
        {
        
        
        // 4 if stock is available
        	System.out.println("-----------Printing stock details for :::::-----" +stockName);
        try
        {
        if(driver.findElement(By.xpath("//span[contains(text()," +stockName+"')]")).isDisplayed());
        {
        
       
        
        // 3 to fetch stock details for Blue Star Foods
        String Last = driver.findElement(By.xpath("//span[contains(text(),'"+stockName+ "')]/ancestor::td/following-sibling::td[1]")).getText();
        String High = driver.findElement(By.xpath("//span[contains(text(),'" +stockName+ "')]/ancestor::td/following-sibling::td[2]")).getText();
        String Low = driver.findElement(By.xpath("//span[contains(text(),'" +stockName+"')]/ancestor::td/following-sibling::td[3]")).getText();
        String percentageChange = driver.findElement(By.xpath("//span[contains(text(),'"+stockName+"')]/ancestor::td/following-sibling::td[4]")).getText();
        
        System.out.println("Last value----" +Last);
        System.out.println("High value----" +High);
        System.out.println("Low value----" +Low);
        System.out.println("percentageChange value----" +percentageChange);
        
        }
        }
        catch(Exception e)
        {
        	System.out.println("print the stock name is not displayed in gainers list" +e.getMessage());
        }
        }
        

}

