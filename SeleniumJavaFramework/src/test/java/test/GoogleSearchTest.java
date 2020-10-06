package test;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch(){

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//**VERY IMPORTANT***: the Thread.sleep() below solved the "auto suggestion" problem
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).click();
				
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		System.out.println("Test completed sucessfully");

	}

}
