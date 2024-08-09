package Selenium_AssignmentNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class P8MouseEvent {
public static void main(String[] args) throws InterruptedException {
	String url ="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	WebDriver driver =DriverConnection.getDriver(url);
	Thread.sleep(2000);
	 WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")) ;
	  username.sendKeys("Admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  login.click();
	  
	Thread.sleep(2000);
	WebElement UserManagement = driver.findElement(By.linkText("User Management "));
	WebElement job = driver.findElement(By.linkText("Job"));
	WebElement organization = driver.findElement(By.linkText("Organization"));
	WebElement qualification = driver.findElement(By.linkText("Qualifications"));
	WebElement nationalities = driver.findElement(By.linkText("Nationalities"));
	WebElement corporatebrand = driver.findElement(By.linkText("Corporate Branding"));
	WebElement configure = driver.findElement(By.linkText("Configuration"));

	Actions action = new Actions(driver);
	action.moveToElement(UserManagement).build().perform();
	Thread.sleep(2000);
    action.moveToElement(job).build().perform();
    Thread.sleep(2000);
    action.moveToElement(organization).build().perform();
    Thread.sleep(2000);
    action.moveToElement(qualification).build().perform();
    Thread.sleep(2000);
    action.moveToElement(nationalities).build().perform();
    Thread.sleep(2000);
    action.moveToElement(corporatebrand).build().perform();
    Thread.sleep(2000);
    action.moveToElement(configure).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
}
