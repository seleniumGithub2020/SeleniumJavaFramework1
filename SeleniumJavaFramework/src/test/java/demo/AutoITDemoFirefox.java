package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemoFirefox {

	public static void main(String[] args) throws Exception{



		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		
		//Instantiate Web Driver
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.tinyupload.com/");
		
		//driver.findElement(By.name("uploaded_file")).click();
       // WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));
		
		//elem.sendKeys("C:\\Users\\dzung\\Desktop\\fileupload.html");
       // elem.sendKeys(Keys.RETURN);
	    
		Actions builder = new Actions(driver);
		
		//***you can use either one below***
		builder.moveToElement(driver.findElement(By.name("uploaded_file"))).click().build().perform();
		//builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
		
		
		
		Runtime.getRuntime().exec("C:\\Users\\dzung\\Documents\\FileUploadScriptFirefox.exe");
		System.out.println("done");
	}


}	
//driver.close();




