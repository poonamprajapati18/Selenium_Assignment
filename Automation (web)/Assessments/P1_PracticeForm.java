package Selenium_Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class P1_PracticeForm {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement fname = driver.findElement(By.id("firstName")) ;
		fname.sendKeys("Pooonam");
		WebElement lname = driver.findElement(By.id("lastName")) ;
		lname.sendKeys("Malaviya");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("poonamalaviya8989@gmail.com");
		 WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		 gender.click();
		 WebElement MobileNo = driver.findElement(By.id("userNumber"));
		 MobileNo.sendKeys("9894535752");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("dateOfBirthInput")).click();
		 WebElement years = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		 Select year = new Select (years);
		 year.selectByVisibleText("1998");
		 WebElement months = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		 Select month = new Select(months);
		 month.selectByIndex(7);
		  String mydate ="8";
		 List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\\\"dateOfBirth\\\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));

			 for(WebElement e:dates) {
					if(e.getText().equals(mydate)) {
						e.click();
					}
			 }
         Thread.sleep(2000);
		WebElement Subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		Subject.click();
		Actions action = new Actions(driver);

		action.keyDown(Keys.SHIFT)
		.sendKeys("english")
		.keyUp(Keys.SHIFT)
		.keyDown(Keys.ENTER)
		.build()
		.perform();
     
		WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		hobbies.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement picture = driver.findElement(By.id("uploadPicture"));
		js.executeScript("arguments[0].scrollIntoView();", picture);

		Thread.sleep(1000);
		picture.sendKeys("I:\\New folder (2)\\DSC_4941.JPG");

		Thread.sleep(2000);

		WebElement address = driver.findElement(By.id("currentAddress")) ;
		address.click();
		address.sendKeys("Mumbai"); 
		
		WebElement state = driver.findElement(By.className("css-19bqh2r"));
		action.click(state)
		.moveToElement(state)
		.sendKeys("Rajasthan")
		.keyDown(Keys.ENTER)
		.build()
		.perform();
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div/svg"));
		action.click(city)
		.moveToElement(city)
		.sendKeys("Jaipur")
		.keyDown(Keys.ENTER)
		.build()
		.perform();
	}
	
					
	
	
	
	
	
}
