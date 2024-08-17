package JunitNew.JunitNew;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

@RunWith(Parameterized.class)
public class P14_MultipleParameter {
	String username;
	String password;

	public P14_MultipleParameter(String username, String password) {
		this.username = username;
		this.password = password;

	}

	static WebDriver driver = null;

	@Before
	public void OpenBrowser() {
		String url = "https://www.instagram.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
		Thread.sleep(2000);
	}

	@Parameters
	public static List<Object[]> data() {
		Object[][] obj = new Object[4][2];

		obj[0][0] = "dopesoulpunnu";
		obj[0][1] = "rivu189";

		obj[1][0] = "dopesoulpunnu";
		obj[1][1] = "rajvini98";

		obj[2][0] = "mumbaigirl";
		obj[2][1] = "rivu189";

		obj[3][0] = "mumbaigirl";
		obj[3][1] = "rajvini98";
		return Arrays.asList(obj);

	}

	
}
