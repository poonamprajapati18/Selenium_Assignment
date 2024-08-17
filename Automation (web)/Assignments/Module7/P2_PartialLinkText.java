package Selenium_AssignmentNew;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P2_PartialLinkText {
public static void main(String[] args) {
	String url ="https://www.facebook.com/";
	WebDriver driver = DriverConnection.getDriver(url);
	 
	List<WebElement> link =driver.findElements(By.partialLinkText("Privacy"));
	for(WebElement e:link) {
		System.out.println(e.getText());
	}
	
	
}
}
