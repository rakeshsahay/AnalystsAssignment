package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Utils.TestUtilClass;

import cucumber.api.Scenario;

public class TestBaseClass {
	public static WebDriver driver;
	public static Properties prop;

public TestBaseClass(){ 
 	try {
 		prop = new Properties();
 		FileInputStream ip = new FileInputStream("D:\\SeleniumProject\\Assignments\\ACS_Testfinal\\src\\main\\java"
 				+ "\\com\\qa\\Utils\\config.properties");
 				prop.load(ip);
 		}
 
 			catch(IOException e){
 				//e.printStackTrace();
 				e.getMessage();
 								}
						}
public static void initialization(){
	String BrowserName = prop.getProperty("browser");
	String DriverPath=prop.getProperty("DriverPath");
	 if(BrowserName.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver", DriverPath);
		 driver = new ChromeDriver(); //Chrome driver is class which is implementing WebDriver interface.
	  }
 
	 driver.manage().window().maximize();
	// driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
 
	 driver.get(prop.getProperty("url"));
}
 //to fetch title of page                                    
	public String ValidatePgTitle(){
	return driver.getTitle();
}
	//to fetch url of page                                    
		public String ValidatePgURL(){
		return driver.getCurrentUrl();
	}
	
		

}
