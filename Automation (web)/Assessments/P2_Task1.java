package Selenium_Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P2_Task1 {
public static void main(String[] args)  throws InterruptedException {
		
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html " ;
        WebDriver driver = DriverConnection.getDriver(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0,1185)", " ");
        
        WebElement Structure = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[1]"));      
        System.out.println(Structure.getText());
        System.out.println();
        
        WebElement Table = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table"));  
        {
    	 List<WebElement> columns = Table.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody//tr[position()>=1 and position()<=5]/th[1]"));
    	    for(WebElement Value : columns )
    	    {
    	        System.out.println(Value.getText() + " ");
    	    }
    	    System.out.println();
        }  
	}

	
	
}

