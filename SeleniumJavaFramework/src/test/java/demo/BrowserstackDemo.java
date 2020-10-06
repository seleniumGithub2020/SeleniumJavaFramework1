package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserstackDemo {

	public static final String AUTOMATE_USERNAME = "huytran29";
	public static final String AUTOMATE_ACCESS_KEY = "gSZ283Tp21UxSx2n43eC";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws Exception {
		
		/*caps.setCapability("browserName", "iPhone");
		caps.setCapability("device", "iPhone 11");
		caps.setCapability("realMobile", "true");
		caps.setCapability("os_version", "13.0");*/
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "62.0");
		caps.setCapability("project", "Test");
		caps.setCapability("build", "Build1");
		caps.setCapability("name", "Test1");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.selenium_version", "3.5.2");
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("BrowserStack");
		element.submit();
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
