package dzungPages_3;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	private  WebElement element = null;

	public WebElement txtbx_UserName(WebDriver driver){

		element = driver.findElement(By.id("log"));

		return element;

	}

	public  WebElement txtbx_Password(WebDriver driver){

		element = driver.findElement(By.id("pwd"));

		return element;

	}

	public  WebElement btn_LogIn(WebDriver driver){

		element = driver.findElement(By.id("login"));

		return element;

	}

}