package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUsingForeach {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = driver.findElement(By.className("country"));
		
		//create an object of select class
		 Select sel = new Select(dropdown);
		 
		//check if the drop down is mono or multi select
		boolean flag = sel.isMultiple();
		System.out.println("Is this dropdown a multiselect" +flag);
		
		 //getOptions to get all the drop down elements
		List<WebElement> options = sel.getOptions();
		
		//get the size of dropdown
		int count = options.size();
		System.out.println("Total no of options in the dropdown" +count);
		
		//print all the options using regular for each loop

        for (WebElement elements : options) 
        {
			System.out.println(elements.getText());
		}
		
		Thread.sleep(4000);
		driver.quit();

	}

}
