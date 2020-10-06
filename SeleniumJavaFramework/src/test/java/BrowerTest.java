import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerTest {
   
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\"
		//		+ "geckodriver\\geckodriver.exe");
		
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		//WebElement textBox = driver.findElement(By.name("q"));
		//textBox.sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
    	System.out.println("count of Input Elements: " + count);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		//driver.quit();
	}
}
