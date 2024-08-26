package browsertest;

import org.openqa.selenium.edge.EdgeDriver;

public class TestEdge {

	public static void main(String[] args) throws Exception {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.com/");
		Thread.sleep(3000);
		driver.close();

	}

}
