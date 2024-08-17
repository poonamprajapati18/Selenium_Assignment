package Selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P3_DeleteButton {
public static void main(String[] args) throws InterruptedException {
	String url ="https://demoqa.com/webtables";
	WebDriver driver = DriverConnection.getDriver(url);
	Thread.sleep(2000);
	
	WebElement button = driver.findElement(By.id("delete-record-1"));
	button.click();
	
	Thread.sleep(2000);
	
	WebElement button1 = driver.findElement(By.id("delete-record-2"));
	button1.click();
	
	Thread.sleep(2000);
	
	WebElement button2 = driver.findElement(By.id("delete-record-3"));
	button2.click();
}
}
