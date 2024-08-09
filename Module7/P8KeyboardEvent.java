package Selenium_AssignmentNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class P8KeyboardEvent {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.name("firstName")).click();

		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys("poonam").keyUp(Keys.SHIFT).build().perform();

		driver.findElement(By.name("lastName")).click();
		action.keyDown(Keys.SHIFT).sendKeys("malaviya").keyUp(Keys.SHIFT).build().perform();

		WebElement phone = driver.findElement(By.name("phone"));
		phone.click();
		phone.sendKeys("8793130212");

		driver.findElement(By.name("userName")).click();
		action.sendKeys("poonamalaviya075@gmail.com").build().perform();

		driver.findElement(By.name("address1")).click();
		action.keyDown(Keys.SHIFT).sendKeys("mumbai").keyUp(Keys.SHIFT).build().perform();

		driver.findElement(By.name("city")).click();
		action.keyDown(Keys.SHIFT).sendKeys("Vasai").keyUp(Keys.SHIFT).build().perform();

		driver.findElement(By.name("state")).click();
		action.keyDown(Keys.SHIFT).sendKeys("Maharashtra").keyUp(Keys.SHIFT).build().perform();

		WebElement Code = driver.findElement(By.name("postalCode"));
		Code.click();
		Code.sendKeys("401212");

		WebElement Country = driver.findElement(By.name("country"));
		Country.click();
		Country.sendKeys("India");
		Country.click();

		driver.findElement(By.name("email")).click();
		action.keyDown(Keys.SHIFT).sendKeys("poonamalaviya").keyUp(Keys.SHIFT).build().perform();

		driver.findElement(By.name("password")).click();
		action.keyDown(Keys.SHIFT).sendKeys("rivu125").keyUp(Keys.SHIFT).build().perform();

		driver.findElement(By.name("confirmPassword")).click();
		action.keyDown(Keys.SHIFT).sendKeys("rivu125").keyUp(Keys.SHIFT).build().perform();
	   
	   
	   
	   
	 
	 
	 
	 
	        
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
