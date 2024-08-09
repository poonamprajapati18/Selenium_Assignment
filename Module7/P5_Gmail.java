package Selenium_AssignmentNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class P5_Gmail {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AdF4I77q3CiaO8uznveg1G0U5VweIbxhMBx-FU7Q2J8qL6mDyaq5E88zLQi4eNcpGXC1SbUtTAIIDQ&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		WebDriver driver = DriverConnection.getDriver(url);
driver .findElement(By.xpath("@id=\\\"vfb-7-2yDmH0d\\\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
		
		WebElement  Firstname = driver.findElement(By.name("firstName"));
		Firstname.sendKeys("poonam");
		
		WebElement Lastname = driver.findElement(By.name("lastName"));
		Lastname.sendKeys("malaviya");
		
		WebElement button = driver .findElement(By.xpath("//*[@id=\"vfb-7-2yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
		button.click();
		
		
		Thread.sleep(5000);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
	    month.selectByValue("8");
	    
	    WebElement days = driver.findElement(By.id("day"));
		days.sendKeys("8");
	    
	    WebElement years = driver.findElement(By.id("year"));
	    years.sendKeys("1998");
	    
	    
	    WebElement genders = driver.findElement(By.id("gender"));
	    genders.click();
	    Select gender = new Select(genders);
	    gender.selectByVisibleText("Female");
	    
	    WebElement button2 = driver .findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
		button2.click();
		
		WebElement CreateGmailAddress = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));
		CreateGmailAddress.click();
		
		Thread.sleep(3000);
		
	}
		

	}


