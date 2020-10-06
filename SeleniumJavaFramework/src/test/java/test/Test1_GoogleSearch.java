package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch(){

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		                                                                                          
		
		
		//**VERY IMPORTANT***: the Thread.sleep() below solved the "auto suggestion" problem
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).click();
		driver.close();
		System.out.println("Test completed sucessfully");

	}

}
