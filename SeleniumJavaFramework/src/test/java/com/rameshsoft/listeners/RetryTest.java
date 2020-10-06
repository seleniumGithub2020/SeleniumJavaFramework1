package com.rameshsoft.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	@Test
	public void login(){
		
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    d.get("https://www.gmail.com");    
	    WebElement userName = d.findElement(By.id("identifier"));
		userName.clear();
	    userName.sendKeys("rameshsoft.selenium");
	    
	    
	    
        /*
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		WebElement userName = driver.findElement(By.name("q"));
		userName.clear();
		userName.sendKeys("Automation Step by Step");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();

		//**VERY IMPORTANT***: the Thread.sleep() below solved the "auto suggestion" problem
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		userName.findElement(By.name("btnKK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		*/

}
}

		
			