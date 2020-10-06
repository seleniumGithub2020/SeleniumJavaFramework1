import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String projectPath =  System.getProperty("user.dir");
		
		//***VERY IMPORTANT***:  without the 2 codes below, the program won't run (probably) as expected 
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\IEdriver\\IEDriverServer.exe");
        //@SuppressWarnings("deprecation")
		
        WebDriver driver = new InternetExplorerDriver(caps);
        
		
		driver.get("https://google.com");
		
        driver.findElement(By.name("q")).sendKeys("ABCD");
       
		//**VERY IMPORTANT***:  the Thread.sleep() below solved the "auto suggestion" problem
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} //this line solved the "auto suggestion problem"
		 driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		 //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        
        
        driver.close();
        driver.quit();
        
	}

}
