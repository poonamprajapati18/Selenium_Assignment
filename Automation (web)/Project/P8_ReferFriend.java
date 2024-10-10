package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P8_ReferFriend {
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
	public void Refer() throws InterruptedException {
		WebElement refer = driver.findElement(By.linkText("Refer a Friend"));
		refer.click();
		Thread.sleep(2000);
		WebElement Fname = driver.findElement(By.id("referFirstName"));
		Fname.sendKeys("Juli");
		WebElement Lname = driver.findElement(By.id("referLastName"));
		Lname.sendKeys("Parmar");
		WebElement Mobile = driver.findElement(By.id("referMobile"));
		Mobile.sendKeys("9898945894");
		WebElement College = driver.findElement(By.id("referCollegeName"));
		College.sendKeys("St.Peters College");
		WebElement Education = driver.findElement(By.xpath("//*[@id=\"referFriendForm\"]/div/div[5]"));
		Select edu = new Select(Education);
		edu.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.id("referFriendSubmit")).click();
		driver.navigate().back();

	}
}
	

