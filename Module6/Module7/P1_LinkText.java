package Selenium_AssignmentNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;


public class P1_LinkText {
  public static void main(String[] args) throws InterruptedException {
	String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver = DriverConnection.getDriver(url);
	Thread.sleep(3000);
	 WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")) ;
	  username.sendKeys("Admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  login.click();
	  
	  
	  
	  
}
	

}
