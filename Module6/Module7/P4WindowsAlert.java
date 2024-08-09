package Selenium_AssignmentNew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P4WindowsAlert {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://the-internet.herokuapp.com/javascript_alerts " ;
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement Alert1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		Thread
		.sleep(2000);
		Alert1.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement Alert2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		Thread.sleep(2000);
		Alert2.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		//alert1.dismiss();
        alert1.accept();
        
        Thread.sleep(3000);
        
        WebElement Alert3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        Thread.sleep(2000);
        Alert3.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.sendKeys("Multiple Alerts");
        alert2.accept();
	    Thread.sleep(3000);
	    driver.quit();
	}


	}


