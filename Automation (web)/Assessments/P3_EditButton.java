package Selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P3_EditButton {
  public static void main(String[] args) throws InterruptedException {
	String url = "https://demoqa.com/webtables";
	WebDriver driver = DriverConnection.getDriver(url);
	
	WebElement button = driver.findElement(By.id("edit-record-3"));
	button.click();
	WebElement firstnme = driver.findElement(By.id("firstName"));
	firstnme.clear();
	firstnme.sendKeys("rivu");
	WebElement lastnme = driver.findElement(By.id("lastName"));
	lastnme.clear();
	lastnme.sendKeys("prajapati");
	WebElement emailEle = driver.findElement(By.id("userEmail"));
	emailEle.clear();
	emailEle.sendKeys("rivvu23@gmail.com");
	WebElement age = driver.findElement(By.id("age"));
	age.clear();
	age.sendKeys("18");
	WebElement salary = driver.findElement(By.id("salary"));
	salary.clear();
	salary.sendKeys("80000");
	WebElement dept = driver.findElement(By.id("department"));
	dept.clear();
	dept.sendKeys("IT");
	Thread.sleep(2000);
	WebElement  button12 = driver.findElement(By.id("submit"));
	button12.click();
	
	WebElement Button = driver.findElement(By.id("edit-record-2"));
	Button.click();
	
	Thread.sleep(5000);
	
	WebElement Firstnme1 = driver.findElement(By.id("firstName"));
	Firstnme1.clear();
	Firstnme1.sendKeys("Mitali");
	WebElement Lastnme1 = driver.findElement(By.id("lastName"));
	Lastnme1.clear();
	Lastnme1.sendKeys("Jadhav");
	WebElement email1 = driver.findElement(By.id("userEmail"));
	email1.clear();
	email1.sendKeys("meetu545@gmail.com");
	WebElement Age1 = driver.findElement(By.id("age"));
	Age1.clear();
	Age1.sendKeys("26");
	WebElement Salary1 = driver.findElement(By.id("salary"));
	Salary1.clear();
	Salary1.sendKeys("40000");
	WebElement Dept1 = driver.findElement(By.id("department"));
	Dept1.clear();
	Dept1.sendKeys("Digital Marketing");
	Thread.sleep(2000);
	WebElement button2 = driver.findElement(By.id("submit"));
	button2.click();
	
	WebElement Btn1 = driver.findElement(By.id("edit-record-3"));
	Btn1.click();
	
	Thread.sleep(5000);
	WebElement Firstnme12 = driver.findElement(By.id("firstName"));
	Firstnme12.clear();
	Firstnme12.sendKeys("Poonam");
	WebElement Lastnme12 = driver.findElement(By.id("lastName"));
	Lastnme12.clear();
	Lastnme12.sendKeys("malaviya");
	WebElement Email12 = driver.findElement(By.id("userEmail"));
	Email12.clear();
	Email12.sendKeys("punnu23@gmail.com");
	WebElement Age12 = driver.findElement(By.id("age"));
    Age12.clear();
	Age12.sendKeys("25");
	WebElement Salary12 = driver.findElement(By.id("salary"));
	Salary12.clear();
	Salary12.sendKeys("50000");
	WebElement Department12 = driver.findElement(By.id("department"));
	Department12.clear();
	Department12.sendKeys("Finance");
	Thread.sleep(2000);
	
	WebElement  button4 = driver.findElement(By.id("submit"));
	button4.click();
	
	
}  
	
	
	
	
	
	
	
	
	
}
