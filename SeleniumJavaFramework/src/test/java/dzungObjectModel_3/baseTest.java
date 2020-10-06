package dzungObjectModel_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import dzungPages_3.Home_Page;

public class baseTest {
	public WebDriver driver = null;
	
	@BeforeTest
	public void setUP(){
        
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\"
				+ "geckodriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.store.demoqa.com");
		driver.get("https://www.w3schools.com");
	}
	
	@AfterTest
	public void TearDown(){
		driver.quit();
	}


}
