package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement toolsdropdown = driver.findElement(By.name("country[]"));
		Select sel = new Select(toolsdropdown);
		System.out.println("Is this dropdown a multiselect:" +sel.isMultiple());
		
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		
		
		System.out.println("First selected option"+sel.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		List<WebElement> SOptions = sel.getAllSelectedOptions();
		for(WebElement selected:SOptions)
		{
			System.out.println(selected.getText());
		}
		Thread.sleep(3000);
		
		//we have an to deselect the options but we cannot deselect all
		sel.deselectAll();
	}

}
