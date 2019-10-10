package com.qa.StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.qa.Pages.HomePage;
import com.qa.base.TestBaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AnalystHomePgTest extends TestBaseClass{
	HomePage homepage;
	public AnalystHomePgTest(){
		
		super();
		
	}
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page()  {
		initialization();
		homepage= new HomePage() ;
	   
	}
	@Then("^validate home page logo$")
	public void validate_home_page_logo() {
		
	boolean flag = homepage.Validatelogo();
	Assert.assertTrue(flag);
	}
	@Then("^validate home page title$")
	public void validate_home_page_title() {
		
	String homepgtitle = homepage.ValidateHomePgTitle();
	//System.out.println(homepgtitle);
	Assert.assertEquals(prop.getProperty("Pgtitle"), homepgtitle);
	
	}
	@Then("^Validate Menu Services at Top Screen$")
	public void Validate_Menu_Services_at_Top_Screen() {
	boolean flag = homepage.titleMenuAtTop("Services");
	Assert.assertTrue(flag);
	}
	
	
	@Then("^Validate Menu Industries at Top Screen$")
	public void Validate_Menu_Industries_at_Top_Screen() {
	boolean flag = homepage.titleMenuAtTop("Industries");
	Assert.assertTrue(flag);
	}
	
	@Then("^Validate Menu Insights at Top Screen$")
	public void Validate_Menu_Insights_at_Top_Screen() {
	boolean flag = homepage.titleMenuAtTop("Insights");
	Assert.assertTrue(flag);
	}
	@Then("^Validate Menu About Us at Top Screen$")
	public void Validate_Menu_About_Us_at_Top_Screen() {
	boolean flag = homepage.titleMenuAtTop("About Us");
	Assert.assertTrue(flag);
	}
	@Then("^Validate Menu Careers at Top Screen$")
	public void Validate_Menu_Careers_at_Top_Screen() {
	boolean flag = homepage.titleMenuAtTop("Careers");
	Assert.assertTrue(flag);
	}
	@Then("^Scroll down Screen to bottom$")
	public void Scroll_down_Screen_to_bottom() {
	 homepage.screenscrolldwn("7");
	
	}
	
	//Bottom menu verification
	@Then("^Validate Menu The Company at Bottom Screen$")
	public void validate_Menu_The_Company_at_Bottom_Screen() {
	   	boolean flag = homepage.titleMenuAtTop("The Company");
		Assert.assertTrue(flag); 
	}

	@Then("^Validate Menu Leadership Team at Bottom Screen$")
	public void validate_Menu_Leadership_Team_at_Bottom_Screen()  {
		boolean flag = homepage.titleMenuAtTop("Leadership Team");
		Assert.assertTrue(flag); 
	  
	}

	@Then("^Validate Menu Careers Team at Bottom Screen$")
	public void validate_Menu_Careers_Team_at_Bottom_Screen()  {
		boolean flag = homepage.titleMenuAtTop("Careers");
		Assert.assertTrue(flag); 
	}

	@Then("^Validate Menu Contact Us at Bottom Screen$")
	public void validate_Menu_Contact_Us_at_Bottom_Screen()  {
		boolean flag = homepage.titleMenuAtTop("Contact Us");
		Assert.assertTrue(flag); 
	}

	@Then("^Validate Menu Privacy Policy at Bottom Screen$")
	public void validate_Menu_Privacy_Policy_at_Bottom_Screen() {
		boolean flag = homepage.titleMenuAtTop("Privacy Policy");
		Assert.assertTrue(flag); 
	}

	@Then("^Validate Menu GDPR Commitment at Bottom Screen$")
	public void validate_Menu_GDPR_Commitment_at_Bottom_Screen()  {
		boolean flag = homepage.titleMenuAtTop("GDPR Commitment");
		Assert.assertTrue(flag); 
	}

	@Then("^Validate Menu Accessibility Statement at Bottom Screen$")
	public void validate_Menu_Accessibility_Statement_at_Bottom_Screen(){
		boolean flag = homepage.titleMenuAtTop("Accessibility Statement");
		Assert.assertTrue(flag); 
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
	    	 FileUtils.copyFile(scrFile, new File("D:\\SeleniumProject\\Assignments\\Acs_Testfinal\\target\\error\\AnalystCareerPg.jpg"));
	    	  } catch (IOException e) {
	    	  // TODO Auto-generated catch block
	    	  e.printStackTrace();
	    	  }
	    	  }
	    }
}
