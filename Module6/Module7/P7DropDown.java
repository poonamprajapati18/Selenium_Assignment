package Selenium_AssignmentNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class P7DropDown {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demo.guru99.com/test/newtours/register.php";
	WebDriver driver=DriverConnection.getDriver(url);
	WebElement Country = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
	Country.click();
	Select country = new Select (Country);
	country.selectByVisibleText("JAPAN");
	Thread.sleep(2000);
	driver.quit();
	}
}
