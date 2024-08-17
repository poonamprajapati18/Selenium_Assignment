package basic;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P15_Login {
   
	 static WebDriver driver = null;
	
	@BeforeClass
	public static void login() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	
	@Test
	public void test1() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rivansh110@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("rivjam");
	}
	@After
	public void CloseBrowser() {
		driver.quit();
		
	}
	
	
	
}
