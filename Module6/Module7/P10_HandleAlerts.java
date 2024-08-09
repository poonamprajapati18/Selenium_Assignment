package Selenium_AssignmentNew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P10_HandleAlerts {

	public static void main(String[] args) 
	{
		String url="https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver=DriverConnection.getDriver(url);
		
		WebElement Alert=driver.findElement(By.name("cusid"));
		Alert.sendKeys("741015656");
		WebElement btn=driver.findElement(By.name("submit"));
		btn.click();
		Alert alert=   driver.switchTo().alert();
		alert.accept();

	}

}
