package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;
import io.opentelemetry.sdk.metrics.data.Data;

public class P6_ResumeBuilder {
 static WebDriver driver= null;
 @BeforeClass
	public static void OpenBrowser() {
		String url = "https://careercenter.tops-int.com/dashboard";
		driver = DriverConnection.getDriver(url);
	}
    //1.login
	@Test(priority = 1)
	public void login() {
		WebElement Mobileno = driver.findElement(By.id("mobile"));
		Mobileno.sendKeys("7410156299");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("7410156299");
		driver.findElement(By.xpath("//input[@class='btn btn-brand btn-block w-75 mx-auto']")).click();
	}
	//2.Personal Details
//	  @Test(priority = 2)
//     public void PersonalDetails() throws InterruptedException {
//		WebElement resume = driver.findElement(By.linkText("Resume Builder"));
//     	resume.click();
//		//1.Personal Details
//		driver.findElement(By.xpath("//*[@id=\"v-pills-personal-tab\"]")).click();
//		WebElement fname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
//		fname.clear();
//		fname.sendKeys("Poonam");
//		WebElement lname = driver.findElement(By.name("last_name"));
//		lname.clear();
//		lname.sendKeys("Prajapati");
//		WebElement Profile = driver.findElement(By.name("title"));
//		Profile.clear();
//		Profile.sendKeys("Diploma in Software Testing and Automation");
//		WebElement Mobile = driver.findElement(By.name("contact"));
//		Mobile.clear();
//		Mobile.sendKeys("7410156299");
//		WebElement Email = driver.findElement(By.name("email"));
//		Email.clear();
//		Email.sendKeys("poonamprajapati1859@gmail.com");
//		WebElement DOB = driver.findElement(By.name("dob"));
//		DOB.click();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		
//		WebElement Address = driver.findElement(By.name("address"));
//		Address.clear();
//		Address.sendKeys("Odhav,Ahmedabad");
//		WebElement LinkedIn = driver.findElement(By.name("linkedin_link"));
//		LinkedIn.clear();
//		LinkedIn.sendKeys("https://www.linkedin.com/in/poonam-prajapati-1b90412b5?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app");
//		WebElement Github = driver.findElement(By.name("github_link"));
//		Github.clear();
//		Github.sendKeys("https://github.com/dashboard");
//		Thread.sleep(2000);
//		driver.findElement(By.id("personalDetailSubmit")).click();
//		}
	
		//3.Profile summary
	    @Test(priority = 3)
     	public void ProfileSummary() throws InterruptedException {
	    	System.out.println("click");
		driver.findElement(By.xpath("//*[@id=\"v-pills-profile-tab\"]")).click();
		Thread.sleep(2000);
		WebElement summary = driver.findElement(By.id("summeryContent"));
		summary.clear();
		summary.sendKeys("Eager to apply my skills in real-world scenario");
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		//Js.executeScript("window.scrollBy(0,500)", "");
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement submit = driver.findElement(By.id("personalDetailSubmit"));
		submit.click();
		Thread.sleep(2000);
     	}
	 	
	    //4.Technical
        @Test(priority = 4)
        public void Technical() throws InterruptedException {
   		driver.findElement(By.xpath("//*[@id=\"v-pills-technical-tab\"]")).click();
		Thread.sleep(2000);
		WebElement ProgrammingLang = driver.findElement(By.id("programmingLanguages"));
		ProgrammingLang.clear(); 
		ProgrammingLang.sendKeys("Java");
		WebElement Database = driver.findElement(By.id("databases"));
		Database.clear();
        Database.sendKeys("MySQL");
        JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement Software = driver.findElement(By.id("softwares"));
		Software.clear();
        Software.sendKeys("JIRA, GIT, JAVA, TestNG, JUNIT, Selenium Web Driver");
        WebElement Systems = driver.findElement(By.id("systems"));
        Systems.clear();
        Systems.sendKeys("Windows");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"technicalSkillsDetailsForm\"]/div[6]/div/input")).click();	
        }
        
        //5.Experience
    	@Test(priority = 5)
		public void Experience() throws InterruptedException {
		WebElement experience = driver.findElement(By.xpath("//*[@id=\"v-pills-projects-tab\"]"));
		experience.click();
		Thread.sleep(2000);
		
		}
		
    	//6.Education
		@Test(priority = 6)
		public void Edu() throws InterruptedException {
		WebElement Education = driver.findElement(By.xpath("//*[@id=\"v-pills-education-tab\"]"));
		Education.click();
		driver.findElement(By.xpath("//*[@id=\"v-pills-education\"]/div/div[4]/div/a")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement download = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/a[2]"));
		download.click();
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		driver.close();
		
		
		
		
	}
}
