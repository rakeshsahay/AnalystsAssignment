package com.qa.StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.Pages.CareerPage;
import com.qa.Pages.HomePage;
import com.qa.base.TestBaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AnalystCareerPgTest extends TestBaseClass{
	CareerPage careerpage;
	
	HomePage homepage;
		public AnalystCareerPgTest(){
			super();
									}
		@Given("^User is on Analyst Home Page$")
		public void User_is_on_Analyst_Home_Page()  {
			initialization();
			careerpage= new CareerPage() ;
			homepage= new HomePage();
			
		   
		}
		@Then("^validate Analyst Home page title$")
		public void validate_Analyst_Home_page_title() {
		
		String HPgTitle = ValidatePgTitle();
		Assert.assertEquals(prop.getProperty("Pgtitle"), HPgTitle);
		}
		
		@Then("^Validate  Menu Careers at Analyst Home Page$")
		public void Validate_Menu_Careers_at_Analyst_Home_Page() {
		boolean flag = homepage.titleMenuAtTop("Careers");
		Assert.assertTrue(flag);
		}
		@Then("^Click on career link at top menu$")
		public void Click_on_career_link_at_top_menu() {
			careerpage.clickonMenu("Careers')]");
		}
		
		@Then("^validate career page URL$")
		public void validate_career_page_URL$() {
			String CPgURL = ValidatePgURL();
			Assert.assertEquals(prop.getProperty("CareerPgURL"), CPgURL);
		}
		@Then("^navigate back to home page$")
		public void navigate_back_to_home_page$() {
			careerpage.clickonLogo("logo");
		}
		
		@Then("^Scrolldown Screen to view bottom menu$")
		public void Scrolldown_Screen_to_view_bottom_menu() throws InterruptedException {
			Thread.sleep(4000);
		 homepage.screenscrolldwn("7");
		
		}
				
		@Then("^click on career link at bottom menu$")
		public void click_on_career_link_at_bottom_menu() throws InterruptedException {
			Thread.sleep(5000);
			
			careerpage.clickoncareerMenubottom();
		}
		
		@Then("^validate career page title$")
		public void validate_career_page_title() {
		
		String CPgTitle = ValidatePgTitle();
		Assert.assertEquals(prop.getProperty("CareerPgtitle"), CPgTitle);
		}
		@After
		public void treadown(){
			driver.quit();
		}
		public void Screenshot(Scenario scenario) {
		    if (scenario.isFailed()) {
		      // Take a screenshot...
		      File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    //  final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      try {
		    	 FileUtils.copyFile(scrFile, new File("D:\\SeleniumProject\\Assignments\\Acs_Testfinal\\target\\error\\Error.jpg"));
		    	  } catch (IOException e) {
		    	  // TODO Auto-generated catch block
		    	  e.printStackTrace();
		    	  }
		    	  }
		    }
		}
		
		
		
