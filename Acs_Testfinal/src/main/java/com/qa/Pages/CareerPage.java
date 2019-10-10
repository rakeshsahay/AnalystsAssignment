package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseClass;

public class CareerPage extends TestBaseClass{
	//Page Factory : Object repository for career page
	@FindBy(xpath="//a[contains(text(),'Careers')]")
	WebElement  TopCareer;
	@FindBy(css="#menu-item-8577 > a")
	WebElement  BottomCareer;
	
	
		
//Initialization of page objects
	public CareerPage(){
		PageFactory.initElements(driver, this);	}

		public void clickonMenu(String item){
			 driver.findElement(By.xpath("//a[contains(text(),'"+ item)).click();
		}
		
//		public void clickoncareerMenubottom(){
//			BottomCareer.click();
//		}
		
		public void clickonLogo(String item){
			 driver.findElement(By.id(item)).click();
		}

		public void clickoncareerMenubottom() {
			// TODO Auto-generated method stub
			BottomCareer.click();
			
		}
		
		
		
		
		
		
		
		
		
}






