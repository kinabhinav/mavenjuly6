package com.blackpearl.blackpearl;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AssessmentForm {
	//public WebDriver driver;
	LoginTest loginforassessment = new LoginTest();
	WaitForAnElement w = new WaitForAnElement();
	@Test
	public void Assessment()
	{
		loginforassessment.login();
		
		//loginforassessment.driver.get("https://blackpearl-uat.kinductdev.com/form/edit/new");
		
		loginforassessment.driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/form/div[1]/div[3]/div/div[2]/input")).sendKeys("Assessment Form 1");
		
		loginforassessment.driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/form/div[1]/div[4]/div/div[2]/textarea")).sendKeys("Test");
		
		loginforassessment.driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/form/div[1]/div[5]/div/div[2]/div/button")).click();
		
		
		loginforassessment.driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/form/div[1]/div[5]/div/div[2]/div/ul/li[1]/a/label")).click();
		loginforassessment.driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/form/div[2]/button[2]")).click();

		
		
	}

}
