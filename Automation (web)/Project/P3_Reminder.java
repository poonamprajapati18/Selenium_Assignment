package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P3_Reminder {
	static WebDriver driver = null;
	   @BeforeClass
	  public static void OpenBrowser() {
		   String url = "https://careercenter.tops-int.com/";
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
		public void remiders() throws InterruptedException {
			System.out.println("remiders");
			WebElement reminder = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/a[1]/i"));
			reminder.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			WebElement home = driver.findElement(By.linkText("Home"));
			home.click();
			driver.close();

		}
		
}
