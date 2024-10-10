package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P1_login {
  static WebDriver driver = null;
   @BeforeClass
  public static void OpenBrowser() {
	   String url = "https://careercenter.tops-int.com/";
	   driver = DriverConnection.getDriver(url);   
  }
	@Test
	 public void login() {
		WebElement Mobileno = driver.findElement(By.id("mobile"));
		Mobileno.sendKeys("7410156299");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("7410156299");
		driver.findElement(By.xpath("//input[@class='btn btn-brand btn-block w-75 mx-auto']")).click();
		}
	
	   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
