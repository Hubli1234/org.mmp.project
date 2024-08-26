package plutoclassexamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSkyScanner {
	static WebDriver driver;

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Access the Chrome Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skyscanner.com/");
		
      generateFutureDate(63,"MMM/dd/YYYY");
		
	}
	
	public static void generateFutureDate(int n,String Format)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(Format);
		String formattedDate = sdf.format(d);
		System.out.println("FormattedDate" +formattedDate);
		String dateArr[] = formattedDate.split("/");
		System.out.println(dateArr[0]);
		System.out.println(dateArr[1]);
		System.out.println(dateArr[2]);
		

	}

}
