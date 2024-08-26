package org.iit.mmp.tests;

import java.time.Duration;

import java.util.HashMap;

import org.iit.mmp.lib.BaseClass;
import org.iit.mmp.lib.Helper;
import org.iit.mmp.lib.MMPLibrary;
import org.iit.mmp.lib.Utility;
import org.iit.mmp.patientmodule.pages.HomePage;
import org.iit.mmp.patientmodule.pages.ScheduleAppointmentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ScheduleAppointmentsTests_Modular extends BaseClass {
	
	//WebDriver driver;   //Initialization once
	
	
	
  
        
	   
	   
	   @Parameters({"doctor","duration"})
	   @Test
	   public void validatebookAppointment(String doctor,String duration)
	   {
		   MMPLibrary mmpLib = new MMPLibrary(driver);
		   
		   
		   mmpLib.launchApplication(prop.getProperty("patienturl"));
		   
		   mmpLib.login(prop.getProperty("patientusername"),prop.getProperty("patientpassword"));
		   
		   mmpLib.navigateToAModule("Schedule Appointment");
		   
		  ScheduleAppointmentPage sPage = new ScheduleAppointmentPage(driver);
		  
		   HashMap<String, String> expectedHMap = sPage.bookAppointment(doctor,Integer.parseInt(duration));
		   
		   HomePage hPage = new HomePage(driver);
		   
		   HashMap<String,String> actualHMap = hPage.fetchPatientTableData();
		   
		   System.out.println(expectedHMap);
		   
		   System.out.println(actualHMap);
		   
		   Assert.assertEquals(actualHMap, expectedHMap);
		   
		   }
	   
	   

}
