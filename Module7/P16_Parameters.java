package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P16_Parameters {
static WebDriver driver =null;
@BeforeClass
  public  void OpenBrowser() {
	driver = DriverConnection.getDriver("https://www.facebook.com/");
}

@Parameters("dp")
@Test(dataProvider = "dp")
public  void loginTest(String email, String password) {
	WebElement emailEle = driver.findElement(By.name("email"));
	emailEle.clear();
	emailEle.sendKeys(email);
	WebElement passEle = driver.findElement(By.name("pass"));
	passEle.clear();
	passEle.sendKeys(password);
}
@DataProvider(name ="dp")
  public static Object[][] data() throws InterruptedException{
	
	Object[][] obj = new Object[4][2];
	obj[0][0] = "mitali085@gmail.com";
	obj[0][1]= "metu9";
	
	Thread.sleep(2000);
	
	obj[1][0] = "mitali085@gmail.com";
	obj[1][1]= "nvjnx3";
	Thread.sleep(2000);

	
	obj[2][0] = "mmmmeetttu45@gmail.com";
	obj[2][1]= "metu9";
	Thread.sleep(2000);

	obj[3][0] = "mwiea12@gmail.com";
	obj[3][1]= "meetrt67";
	  return obj;
}





}
