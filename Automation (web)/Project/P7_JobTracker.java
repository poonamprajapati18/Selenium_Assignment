package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P7_JobTracker {
	static WebDriver driver = null;

	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://careercenter.tops-int.com/dashboard";
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
	public void Job() {
		WebElement Tracker = driver.findElement(By.linkText("Job Tracker"));
		Tracker.click();
		WebElement course = driver.findElement(By.name("courses"));
		course.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.navigate().back();

	}

	@Test(priority = 3)
	public void UploadReview() throws InterruptedException {
		WebElement Upload = driver.findElement(By.linkText("Upload Reviews"));
		Upload.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1800)", "");
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void Rewards() throws InterruptedException {
		WebElement reward = driver.findElement(By.linkText("Rewards"));
		reward.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1800)", "");
		driver.navigate().back();
	}

}
	
	
	
	
	
	
	
	

