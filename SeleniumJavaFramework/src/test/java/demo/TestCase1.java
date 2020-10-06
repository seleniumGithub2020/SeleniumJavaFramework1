package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCase1{

	public WebDriver driver = null;

	public static final String USERNAME = "crocodile_2020";
	public static final String ACCESS_KEY = "d1afcc15-161e-40ed-a56d-e6209703f4e1";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


	@BeforeClass
	@Parameters({"browser", "version", "platform" })
	public void setup(String br, String vr, String pf) throws MalformedURLException{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browsername", br);
		capabilities.setCapability("version", vr);
		capabilities.setCapability("platform", pf);
		capabilities.setCapability("name", "testcase1");
		//driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
		driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
	}

	@Test
	public void verfifyLogin()
	{

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	
	}

	@AfterClass
	public void tearDown()
	{
		
	    /*
	       "Test Didn't See a New Command for 90 Seconds" error:
		   Make sure your script includes a session ending request "driver.quit() or browser.stop() " 
		   to conclude the test
		*/
		
		driver.quit();	
	}

}