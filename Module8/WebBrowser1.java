package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class WebBrowser1 {
	public static void main(String[] args) {
	String url = "https://www.instagram.com/";
  WebDriver driver = DriverConnection.getDriver(null);
   WebElement username = driver.findElement(By.name("username"));
   username.sendKeys("poonam");
   WebElement Password = driver.findElement(By.name("password"));
   Password.sendKeys("punnu0782");
   driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
   driver.quit();
   
   
   
   
   
}
}