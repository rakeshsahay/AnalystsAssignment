package com.qa.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseClass;

public class HomePage extends TestBaseClass{
	//Page Factory : Object repository
	
			@FindBy(xpath="//img[@alt='Analysts']")
			WebElement Analystlogo;
			@FindBy(xpath="//a[contains(text(),'Services')]")
			WebElement  Menuservices;
			@FindBy(xpath="//a[contains(text(),'Industries')]")
			WebElement MenuInustries;
			@FindBy(xpath="//a[contains(text(),'Insights')]")
			WebElement MenuInsight;
			@FindBy(xpath="//a[contains(text(),'About Us')]")
			WebElement MenuAboutus;
			
		//Initialization of page objects
			public HomePage(){
				PageFactory.initElements(driver, this);	}

	//Actions Methods
	//Validating logo
	public boolean Validatelogo(){
	return Analystlogo.isDisplayed();
				
			}
	//Validating Page title
	public String ValidateHomePgTitle(){
			return driver.getTitle();
	}
	
	//Validating menus present at page
		public boolean titleMenuAtTop(String menu){
			return driver.findElement(By.linkText(menu)).isDisplayed();
													}	
		//clicking object to scroll down page
	 public void screenscrolldwn(String item){
			driver.findElement(By.xpath("//a[contains(text(),'"+ item +"')]")).click();
			    }	
		
	    }

	


	
	
	

