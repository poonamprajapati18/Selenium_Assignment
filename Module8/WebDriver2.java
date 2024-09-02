package JunitNew.JunitNew;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class WebDriver2 {
 static WebDriver driver = null;
  @BeforeClass
  public void OpenBrowser() {
	  String url ="https://www.instagram.com/";
	 driver = DriverConnection.getDriver(url);
	 
}
  @Test
  public void login() throws InterruptedException {
	  WebElement Username = driver.findElement(By.name("username"));
	  Username.sendKeys("dreamy_girlpunnu");
	  WebElement Password = driver.findElement(By.name("password"));
	  Password.sendKeys("punnu897");
	  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	  Thread.sleep(2000);
	  
  }
  @AfterClass
  public void closeBrowser() {
	  driver.quit();
  }
}
