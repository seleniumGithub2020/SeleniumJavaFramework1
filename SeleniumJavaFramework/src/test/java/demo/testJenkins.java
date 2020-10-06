package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testJenkins {

	@Test
	public void test(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\dzung\\Desktop\\fileupload.html");
		
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		
		WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));
		elem.sendKeys("C:\\Users\\dzung\\Desktop\\fileupload.html");
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\dzung\\Desktop\\AutoIT\\Fileupload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.quit();
		
	}
}
