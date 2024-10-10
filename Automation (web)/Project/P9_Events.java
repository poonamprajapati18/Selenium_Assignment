package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P9_Events {
	static WebDriver driver= null;
	 @BeforeClass
		public static void OpenBrowser() {
			String url = "https://careercenter.tops-int.com/events";
			driver = DriverConnection.getDriver(url);
		}

		@Test(priority = 1)
		public void login() {
			WebElement Mobileno = driver.findElement(By.id("mobile"));
			Mobileno.sendKeys("7410156299");
			WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("7410156299");
			driver.findElement(By.xpath("//input[@class='btn btn-brand btn-block w-75 mx-auto']")).click();
		}
		@Test(priority = 2)
		public void Events() throws InterruptedException {
			WebElement even=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[9]/aaa"));
			even.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;

			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
			
			

//			WebElement event = driver.findElement(By.linkText("Events"));
//			event.click();
//			Thread.sleep(2000);		
//			WebElement Location = driver.findElement(By.id("studentLocation"));
//			Location.click();
//			Thread.sleep(2000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//			Thread.sleep(3000);
//			WebElement Video = driver.findElement(By.className("rounded"));
//			Video.click();
//			js.executeScript("window.scrollBy(0,-1800)", "");
//			driver.navigate().back();

		}
		
}
