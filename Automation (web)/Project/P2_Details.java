package TestNG_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class P2_Details {
	static WebDriver driver = null;

	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://careercenter.tops-int.com/personal-details";
		driver = DriverConnection.getDriver(url);
	}

	@Test(priority = 1)
	public void login() {
		WebElement Mobileno = driver.findElement(By.id("mobile"));
		Mobileno.sendKeys("7410156299");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("7410156299");
		driver.findElement(By.xpath("//input[@class='btn btn-brand btn-block w-75 mx-auto']")).click();
	}

	// 1.Personal Details
	@Test(priority = 2)
	public void Profile() throws InterruptedException {
		System.out.println("profile ");
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(2000);
	    driver.findElement(By.className("select2-selection__rendered")).click();
	    Thread.sleep(2000);
        WebElement Salutation = driver.findElement(By.xpath("//li[@id='select2-salutation-result-2ear-Mrs']"));
		Salutation.click(); 
		Thread.sleep(2000);
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.clear();
		Firstname.sendKeys("poonam123");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.clear();
		lastname.sendKeys("prajapati");
		WebElement Email = driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("poonamprajapati@gmail.com");
		WebElement Mobile = driver.findElement(By.className("form-control"));
		Mobile.clear();
		Mobile.sendKeys("7410156299");
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.clear();
		Phone.sendKeys("9016240368");
		WebElement LinkedIn = driver.findElement(By.id("linkedin_id"));
		LinkedIn.clear();
		LinkedIn.sendKeys("https://www.linkedin.com/in/poonam-prajapati");
		Thread.sleep(2000);
		WebElement Instagram = driver.findElement(By.id("instagram_id"));
		Instagram.clear();
		Instagram.sendKeys("https://www.instagram.com/poonammalaviya");
		WebElement Gender = driver.findElement(By.className("select2-selection__rendered"));
		Gender.click();
		Select gender = new Select(Gender);
		gender.selectByVisibleText("Female");
		WebElement Marital = driver.findElement(By.className("select2-selection__placeholder"));
		Marital.click();
		Select marital = new Select(Marital);
		marital.selectByVisibleText("Married");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("birthdate")).click();
		WebElement Fathername = driver.findElement(By.name("father_name"));
		Fathername.sendKeys("Dayaram Malaviya");
		WebElement Mothername = driver.findElement(By.id("motherName"));
		Mothername.sendKeys("Pushpa Malaviya");
		WebElement Guardian = driver.findElement(By.id("guardianName"));
		Guardian.sendKeys("Magaji");
		Thread.sleep(2000);
		driver.findElement(By.id("select2-religion-container")).click();
		WebElement Religion = driver.findElement(By.id("select2-religion-results"));
		Religion.click();
		driver.findElement(By.id("select2-category-container")).click();
		WebElement Category = driver.findElement(By.id("select2-category-results"));
		Category.click();
		driver.findElement(By.className("select2-search__field")).click();
		WebElement Disability = driver.findElement(By.id("select2-disability-result-la1a-No"));
		Disability.click();
		driver.findElement(By.className("select2-selection__rendered")).click();
		WebElement IDtype = driver.findElement(By.id("select2-idType-result-gh05-Aadhar ID"));
		IDtype.click();
		WebElement IDnum = driver.findElement(By.id("id_no"));
		IDnum.clear();
		IDnum.sendKeys("743329535730");
		Thread.sleep(2000);
		driver.findElement(By.className("select2-selection__rendered")).click();
		WebElement Education = driver.findElement(By.id("select2-educationLevel-results"));
		Education.click();
		WebElement Address = driver.findElement(By.id("address"));
		Address.clear();
		Address.sendKeys("Odhav");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollby(0,500)", "");
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.name("pincode"));
		pincode.clear();
		pincode.sendKeys("Odhav");
		Thread.sleep(2000);
		driver.findElement(By.className("select2-selection__rendered")).click();
		WebElement Country = driver.findElement(By.id("select2-country-result-kets-India"));
		Country.click();
		Thread.sleep(2000);
		driver.findElement(By.id("select2-state-container")).click();
		WebElement State = driver.findElement(By.id("select2-state-results"));
		State.click();
		Thread.sleep(2000);
		driver.findElement(By.id("select2-city-container")).click();
		Thread.sleep(2000);
		WebElement City = driver.findElement(By.id("select2-city-results"));
		City.click();
		Thread.sleep(2000);
		driver.findElement(By.id("select2-trainingStatus-container")).click();
		Thread.sleep(2000);
		WebElement Training = driver.findElement(By.id("select2-trainingStatus-result-bdbj-Fresher"));
		Training.click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement btn = driver.findElement(By.id("aadharFront"));
		js2.executeScript("arguments[0].scrollIntoView();", btn);
		btn.sendKeys("I:\\New folder (2)\\DSC_4940.JPG");

		WebElement btn1 = driver.findElement(By.id("aadharBack"));
		js2.executeScript("arguments[0].scrollIntoView(1);", btn1);
		btn1.sendKeys("I:\\New folder (2)\\DSC_4950.JPG");
	}

	// 2.Education Details
	@Test(priority = 3)
	public void EducationDetails() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(2000);
		WebElement edu = driver.findElement(By.linkText("Education Details"));
		edu.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[3]/a")).click();
		Thread.sleep(2000);
		WebElement Degree = driver.findElement(By.id("degree"));
		Select degree = new Select(Degree);
		degree.selectByIndex(6);
		Thread.sleep(2000);
		WebElement University = driver.findElement(By.id("collegeName"));
		University.sendKeys("Mumbai University");
		WebElement Passing = driver.findElement(By.id("passingYear"));
		Passing.click();
		WebElement Result = driver.findElement(By.name("result"));
		Result.sendKeys("68");
		driver.findElement(By.id("eduResultUnit")).click();
		driver.findElement(By.xpath("//*[@id=\"mobileAddBtnSection-courseEdu\"]/div/input")).click();
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		Thread.sleep(2000);
	}

//	// 3.Change Password
	@Test(priority = 4)
	public void Password() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.linkText("Change Password"));
		pass.click();
		WebElement Currentpassword = driver.findElement(By.id("current_password"));
		Currentpassword.sendKeys("7410156289");
		WebElement NewPassword = driver.findElement(By.id("new_password"));
		NewPassword.sendKeys("7410156299");
		WebElement ConfirmPassword = driver.findElement(By.id("confirm_password"));
		ConfirmPassword.sendKeys("7410156299");
		Thread.sleep(2000);
		driver.findElement(By.id("changePasswordSubmit")).click();
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		Thread.sleep(2000);
	}

//	// 4.logout
	@Test(priority = 5)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(2000);
		WebElement Logout = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a"));
		Logout.click();
	}
}
