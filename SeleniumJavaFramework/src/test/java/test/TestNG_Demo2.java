package test;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	 WebDriver driver = null;
	 
	 @BeforeTest
	 public void setUpTest(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe" );
		driver = new ChromeDriver();
	}
	
	 @Test
	 public  void googleSearch2(){

		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		                                                                                          
		
		
		//**VERY IMPORTANT***: the Thread.sleep() below solved the "auto suggestion" problem
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		
	}
	
	 @Test
	 public  void googleSearch3(){

		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		                                                                                          
		
		
		//**VERY IMPORTANT***: the Thread.sleep() below solved the "auto suggestion" problem
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		
	}
	 
	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		System.out.println("Test completed #2 sucessfully");
        }

}
