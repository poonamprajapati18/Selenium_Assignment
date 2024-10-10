package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P4_Certificate {
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
	public void certificate() throws InterruptedException {
		WebElement mycerti = driver.findElement(By.linkText("Certificate"));
		mycerti.click();
		WebElement course = driver.findElement(By.id("courseJob"));
		course.click();
		Thread.sleep(2000);
		WebElement Feedback = driver.findElement(By.linkText("Share Feedback to Download"));
		Feedback.click();
		Thread.sleep(2000);
		WebElement support = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[1]/div[2]"));
		support.click();
		WebElement Facilities = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[2]/div[2]"));
		Facilities.click();
		WebElement Trainers = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[3]/div[2]"));
		Trainers.click();
		WebElement Practical = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[4]/div[2]"));
		Practical.click();
		WebElement Content = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[5]/div[2]"));
		Content.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		WebElement Interview = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[6]/div[2]"));
		Interview.click();
		WebElement Placement = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[7]/div[2]"));
		Placement.click();
		Thread.sleep(2000);
		WebElement Job = driver.findElement(By.xpath("//*[@id=\"courseFeedbackForm\"]/div[9]/div[2]"));
		Job.click();
		WebElement Topic = driver.findElement(By.id("topic"));
		Topic.sendKeys("Java");
		WebElement Reference = driver.findElement(By.name("reference_name"));
		Reference.sendKeys("Poonam");
		WebElement MobileNo = driver.findElement(By.name("reference_mobile"));
		MobileNo.sendKeys("7410156299");
		WebElement Feedback1 = driver.findElement(By.name("feedback"));
		Feedback1.click();
		Thread.sleep(2000);
		driver.findElement(By.id("courseFeedbackFormSubmit")).click();
		driver.quit();

	}
}
