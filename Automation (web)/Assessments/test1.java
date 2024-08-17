package Listener;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class test1{
   WebDriver driver = null;
   String url ="https://www.demo.guru99.com/V4/";
   @Test
    public void Test2() {
    	driver = DriverConnection.getDriver(url) ;  
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle = "GURU99";
//	assertEquals(actualtitle,expectedtitle);
    }
   
  @Test
   public void loginTest(ITestContext con) {
	   driver = DriverConnection.getDriver(url);
	   con.setAttribute("Guru", driver);
	   WebElement userEle = driver.findElement(By.name("uid"));
	   userEle.sendKeys("poonam23ma");
	   WebElement passEle = driver.findElement(By.name("password"));
	   passEle.sendKeys("rivu90po");
	   driver.findElement(By.name("btnLogin")).click();
	   assertFalse(true);
   }
}
