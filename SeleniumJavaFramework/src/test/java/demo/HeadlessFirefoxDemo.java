package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefoxDemo {

	public static void main(String[] args) throws InterruptedException {
		//set the driver server exe path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");

		//Instantiate Web Driver
		WebDriver driver = new FirefoxDriver(options);
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		// get the title of the page
		System.out.println("Page title is - " + driver.getTitle());
		// get the title of the url
		System.out.println("Current Url : "+ driver.getCurrentUrl());
		// find the element
		driver.findElement(By.name("q"));
		// close the browser
		driver.close();
  }


}
