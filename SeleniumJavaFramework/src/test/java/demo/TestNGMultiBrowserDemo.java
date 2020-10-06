package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName){	
        
		//***VERY IMPORTANT***:  the 2 lines below are necessary for "ie" explore to run
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		
		System.out.println("Browser name is : " + browserName);
		System.out.println("Thread id : " + Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
			//***VERY IMPORTANT***:  the line below will cause error
			//WebDriver driver = new ChromeDriver();  ***this line will cause error***
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){

			//***VERY IMPORTANT***:  the line below will cause error
			//WebDriver driver = new FirefoxDriver();  ***this line will cause error***
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
	else if(browserName.equalsIgnoreCase("ie")){

		//***VERY IMPORTANT***:  the line below will cause error
		//WebDriver driver = new InternetExplorerDriver();  ***this line will cause error***
		System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
	    driver = new InternetExplorerDriver(caps);
	    }
	}
	@Test
	public void test1() throws Exception{

		driver.get("https://google.com");
		Thread.sleep(4000);
	}

	@AfterTest
	public void teardown(){

		driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully");
	}
}


