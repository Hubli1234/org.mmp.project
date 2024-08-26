package org.iit.mmp.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	protected WebDriver driver;
	private By dateXpath = By.xpath("//table[@class='table']/tbody/tr[1]/td[1]");
	//int          x                =  10;
	private By timeXpath = By.xpath("//table[@class='table']/tbody/tr[1]/td[2]");
	private By appointmentXpath = By.xpath("//table[@class='table']/tbody/tr[1]/td[3]");
	private By doctorXpath = By.xpath("//table[@class='table']/tbody/tr[1]/td[4]");
	

	
	public HomePage(WebDriver driver){
	    this.driver = driver;
	    if (!driver.getTitle().equals("Home")) 
	    {
	      throw new IllegalStateException("This is not ScheduleAppointmentPage for Login user," +
	            " current page is: " + driver.getCurrentUrl());
	    }
	}
	    
	    
	public HashMap<String,String> fetchPatientTableData()
	   {
		   String date = driver.findElement(dateXpath).getText();
			String time = driver.findElement(timeXpath).getText();
			String appointment = driver.findElement(appointmentXpath).getText();
			String doctor = driver.findElement(doctorXpath).getText();
			System.out.println(date+"----"+time+"----"+appointment+"----"+doctor);  
			HashMap<String,String> actualHMap = new HashMap<String,String>();
			actualHMap.put("date", date);
			actualHMap.put("time", time);
			actualHMap.put("appointment", appointment);
			actualHMap.put("doctor", doctor);
			return actualHMap;
			
	   }

}
