package JunitNew.JunitNew;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P13_Login {
    static WebDriver driver = null;
    
     @BeforeClass   
	public static void beforeclass() {
		String url = "https://www.saucedemo.com/";
		 driver = DriverConnection.getDriver(url);
     }
		@Test 
		public void Login() throws InterruptedException {
			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("visual_user");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			WebElement login = driver.findElement(By.id("login-button"));
					login.click();
		    Thread.sleep(2000);
		}
		@AfterClass
		 public static void CloseBrowser() {
			 driver.quit();
			 
	}
	

	
	
	
	
	
	
	
	
	
	
}
