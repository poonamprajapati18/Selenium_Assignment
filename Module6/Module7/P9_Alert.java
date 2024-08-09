package Selenium_AssignmentNew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P9_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		 String url="https://demo.automationtesting.in/Alerts.html";
		 WebDriver driver=DriverConnection.getDriver(url);
	
		WebElement btn=driver.findElement(By.className("analystic"));
		btn.click();
		Thread.sleep(2000);
		WebElement btn1=driver.findElement(By.linkText("click the button to display an  alert box:"));
		btn1.click();
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();

	}

}
