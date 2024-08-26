package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppRedirection {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/");
     Thread.sleep(3000);
      String redirectedurl = driver.getCurrentUrl();
      System.out.println(redirectedurl);
      driver.quit();
     

	}

}
