package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemoChrome {

	public static void main(String[] args) throws Exception{
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.tinyupload.com/");
		  
		Actions builder = new Actions(driver);
				
		//builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
		builder.moveToElement(driver.findElement(By.name("uploaded_file"))).click().build().perform();
		
		
		Runtime.getRuntime().exec("C:\\Users\\dzung\\Documents\\FileUploadScriptChrome.exe");
		System.out.println("done");
	}


}	
//driver.close();




