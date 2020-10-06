package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesFile;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName=null;
	private static Logger logger = LogManager.getLogger(TestNG_Demo.class);

	@BeforeTest
	public void setUpTest(){
		String projectPath = System.getProperty("user.dir");
		propertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		logger.info("Browser started");
	}

	@Test
	public  void googleSearch(){

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
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void tearDownTest(){
        driver.close();
		//driver.quit(); **note:  driver.quit() have problem in firefox
		System.out.println("Test completed #1 sucessfully");
		propertiesFile.setProperties();
	}
}
