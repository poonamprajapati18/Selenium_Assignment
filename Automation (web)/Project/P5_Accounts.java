package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P5_Accounts {
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
	public void account() throws InterruptedException {
		WebElement acc = driver.findElement(By.linkText("Accounts"));
		acc.click();
		WebElement course = driver.findElement(By.name("courses"));
		course.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		WebElement Installment1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[4]/div[5]"));
		Installment1.click();
		WebElement Installment2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[5]/div[5]"));
		Installment2.click();
		WebElement Installment3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[6]/div[5]"));
		Installment3.click();
		Thread.sleep(2000);
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,200)", "");
		WebElement Installment4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[7]/div[5]"));
		Installment4.click();
		Thread.sleep(2000);
		driver.navigate().back();

	}

}
