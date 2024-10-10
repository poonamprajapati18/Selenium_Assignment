package TestNG_Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P3_MyCourses {
	static WebDriver driver = null;

	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://careercenter.tops-int.com/dashboard";
		driver = DriverConnection.getDriver(url);
	}

	@Test(priority = 1)
	public void login() {
		WebElement Mobileno = driver.findElement(By.id("mobile"));
		Mobileno.sendKeys("7410156299");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("7410156299");
		driver.findElement(By.xpath("//input[@class='btn btn-brand btn-block w-75 mx-auto']")).click();
		System.out.println("login done");
	}

	// 1.course details
	@Test(priority = 2)
	public void CourseDetails() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		WebElement course = driver.findElement(By.linkText("Course Details"));
		course.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement lecture = driver
				.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[1]/div[1]/div/div[1]/div[2]/a[1]"));
		lecture.click();
		Thread.sleep(3000);
		System.out.println("lecture");
		WebElement handbook = driver
				.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[1]/div[1]/div/div[1]/div[2]/a[2]/label"));
		handbook.click();
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		Set<String> allWin = driver.getWindowHandles();
		System.out.println();
		for (String s : allWin) {
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
			}
		}
		Thread.sleep(2000);
		System.out.println("all win done");
		WebElement Attendance = driver.findElement(By.xpath("//*[@id=\"course-attendance-tab\"]"));
		Attendance.click();
		Thread.sleep(2000);
		WebElement Accounts = driver.findElement(By.id("course-accounts-tab"));
		Accounts.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Recordedlec = driver.findElement(By.id("course-recorded-lectures-tab"));
		Recordedlec.click();
		Thread.sleep(2000);
		WebElement Reference = driver.findElement(By.linkText("Reference\r\n" + " - 1"));
		Reference.click();
		Thread.sleep(2000);
		WebElement Report = driver.findElement(By.id("course-progress-report-tab"));
		Report.click();
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("course done");
	}

	// 2.Project
	@Test(priority = 3)
	public void Project() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		WebElement Jobseeker = driver.findElement(By.linkText("Projects"));
		Jobseeker.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("project done");
	}

//	3.Assignment
	@Test(priority = 4)
	public void Assignment() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		Thread.sleep(2000);
		WebElement assign = driver.findElement(By.linkText("Assignment"));
		assign.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js2.executeScript("winddow.scrollBy(0,-1500)");

		Thread.sleep(3000);
		WebElement downloadfile = driver
				.findElement(By.xpath("//*[@id=\"course-assignment\"]/div/div[2]/div/div[2]/a"));
		downloadfile.click();
		String mainWin = driver.getWindowHandle();
		System.out.println("main window");
		Set<String> allWin = driver.getWindowHandles();
		for (String s : allWin) {
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
			}
		}
		driver.switchTo().window(mainWin);
		System.out.println("assignment done");
	}

	// 4.Assessment
	@Test(priority = 5)
	public void Assessment() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		WebElement assign = driver.findElement(By.linkText("Assessment"));
		assign.click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
//		WebElement downloadfile = driver.findElement(By.linkText("Download"));
//		downloadfile.click();
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0,600)", "");
		driver.navigate().back();

	}

	// 5.Interview Questions
	@Test(priority = 6)
	public void InterviewQ() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
		WebElement Interview = driver.findElement(By.linkText("Interview Questions"));
		Interview.click();
		Thread.sleep(2000);
		WebElement downloadfile = driver.findElement(By.linkText("Download File"));
		downloadfile.click();
		Thread.sleep(2000);
		WebElement downloadfile1 = driver.findElement(By.linkText("Download File"));
		downloadfile1.click();
		Thread.sleep(2000);
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,500)", "");
		WebElement downloadfile2 = driver.findElement(By.linkText("Download File"));
		downloadfile2.click();
		Thread.sleep(2000);
		driver.navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement home = driver.findElement(By.id("main-header"));
		home.click();

	}
}
