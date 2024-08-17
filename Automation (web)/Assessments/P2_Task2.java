package Selenium_Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P2_Task2 {
public static void main(String[] args) {
	String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	WebDriver driver = DriverConnection.getDriver(url);
	
	
	
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr/th"));

	for(WebElement R:rows) {
		System.out.println(R.getText() +" ");
	}
	List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr/td"));
	for(WebElement C:columns) {
	    System.out.println(C.getText()+ " ");
	}
	System.out.println();
}
}
