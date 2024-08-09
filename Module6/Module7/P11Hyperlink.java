package Selenium_AssignmentNew;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P11Hyperlink {
public static void main(String[] args) {
	String url = "https://demo.guru99.com/test/web-table-element.php";
  WebDriver driver = DriverConnection.getDriver(url);
  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
  for (int i=0; i<= rows.size();i++) {
List<WebElement>columns = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" +i+"]/td;"));
 for (int j= 1; j<= columns.size();j++ ) {
	 WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]"));
			 System.out.print(data.getText());
			 System.out.println();
			 
 }
		
  }
}
}
