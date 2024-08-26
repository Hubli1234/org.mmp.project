package testngannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// ctrl+shift+O
public class TestCases2 extends BaseCase {
	
    
    @Test
    public void testCase4()
    {
    	System.out.println("Test Case Four Executed");
    	
    }
    @Test
    public void testCase5()
    {
    	System.out.println("Test Case Five Executed");
    	
    }
    
    @Test
    public void testCase6()
    {
    	System.out.println("Test Case Six Executed");
    }
}
