package com.blackpearl.blackpearl;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest { 
	public WebDriver driver;
	@Test
	public void login()
	
	{ 
	
	System.setProperty("webdriver.chrome.driver", "/Users/abhatnagar/eclipse/jee-oxygen2/Eclipse.app/Contents/MacOS/Applications/blackpearl/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
	driver = new ChromeDriver();
		
	driver.get("https://blackpearl.kinductdev.com/login");
	}
}
