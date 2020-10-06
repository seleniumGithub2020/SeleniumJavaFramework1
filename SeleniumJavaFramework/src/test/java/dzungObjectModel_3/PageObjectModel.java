package dzungObjectModel_3;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dzungPages_3.Home_Page;
import dzungPages_3.LogIn_Page;

public class PageObjectModel extends baseTest {

	WebDriver driver = super.driver;
	
	Home_Page hp = new Home_Page();
	LogIn_Page lp = new LogIn_Page();

	@Test
	public void logIn_HomePage(){
		hp.lnk_MyAccount(driver).click();
	}
	@Test
	public void pages(){
		lp.txtbx_UserName(driver).sendKeys("testuser_1");

		lp.txtbx_Password(driver).sendKeys("Test@123");

		lp.btn_LogIn(driver).click();
	}
	
	@Test
	public void log_out(){
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");	
		hp.lnk_LogOut(driver).click(); 
	}
}