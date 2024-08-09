package Selenium_AssignmentNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P6RadioButton {
public static void main(String[] args) throws InterruptedException {
	String url = "https://demo.guru99.com/test/radio.html";
	WebDriver driver = DriverConnection.getDriver(url);
	WebElement radiobutton1 = driver.findElement(By.id("vfb-7-1"));
	radiobutton1.click();
	Thread.sleep(2000);
	WebElement radiobutton2 = driver.findElement(By.id("vfb-7-2"));
	radiobutton2.click();
	Thread.sleep(2000);
	WebElement radiobutton3 = driver.findElement(By.id("vfb-7-3"));
	radiobutton3.click();
	
	
}
}
