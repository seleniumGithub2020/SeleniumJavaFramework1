package dzungObjectModel_2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dzungPOM_1.Home_Page;
import dzungPOM_1.LogIn_Page;

public class PageObjectModel {

	private static WebDriver driver = null;
	@BeforeTest
	public void setUP(){

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\"
				+ "geckodriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.store.demoqa.com");
		
	}

	// Use page Object library now
	@Test
	public void logIn_HomePage(){
		Home_Page.lnk_MyAccount(driver).click();
	}
    @Test
	public void pages(){
		LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

		LogIn_Page.btn_LogIn(driver).click();


	}
    @AfterTest
	public void log_out(){
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");	
		Home_Page.lnk_LogOut(driver).click(); 

		driver.quit();
	}


}