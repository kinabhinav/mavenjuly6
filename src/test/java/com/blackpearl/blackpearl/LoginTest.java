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
	
driver.manage().window().maximize(); 
	
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    
	js1.executeScript("javascript:window.scrollBy(250,350)");
	
	driver.findElement(By.xpath(".//*[@id='login_form']/button")).click();

	}
}
