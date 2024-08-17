package Selenium_Assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class P2_Task3 {
 public static void main(String[] args) throws InterruptedException {
	String url= "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	WebDriver driver = DriverConnection.getDriver(url);
	
	WebElement height  = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[4]/span"));
			System.out.println(height.getText() +" ");
			
		List <Integer>list = new ArrayList<Integer>();
		list.add(829);
		list.add(601);
		list.add(509);
		list.add(492);
  Iterator <Integer> itr = list.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  Thread.sleep(2000);
  
  int Maximumheight = list.get(0);
   for (int i = 1; i<list.size();i++) {
	 if (Maximumheight<list.get(i)) {
		 System.out.println("maximum tallest structure is " +Maximumheight);
	 }
		 
   }
    
    driver.quit();
  
		
		}
			
			
			
		}
	 
    

	
	
	
	

