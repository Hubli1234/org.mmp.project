package configdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader
{
	public static void main(String[] args) {
	try
	{
     File file = new File("./src/test/resources/config/configproperties");
    FileInputStream fis = new FileInputStream(file);
    Properties prop = new Properties();
    prop.load(fis);
    
    String browser = prop.getProperty("browser");
    System.out.println("browser in use :"+browser);
    
    String application = prop.getProperty("url");
    System.out.println("Navigated to :"+application);
       
       }
	catch (Exception e) {

     e.printStackTrace();
	}
	
		
}
}
