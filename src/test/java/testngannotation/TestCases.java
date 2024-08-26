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

public class TestCases extends BaseCase {
	
    
    @Test
    public void testCase1()
    {
    	System.out.println("Test Case One Executed");
    	
    }
    @Test
    public void testCase2()
    {
    	System.out.println("Test Case two Executed");
    	
    }
    @Test
    public void testCase3()
    {
    	System.out.println("Test Case three Executed");
    	
    }
}
