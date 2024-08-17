package Listener;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoginTest implements ITestListener {
@Override
public void  onTestStart (ITestResult result) {
	System.out.println("test start running");
}
@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("test skipped");
}

public void onTestFailure(ITestResult result) {
	WebDriver driver = (WebDriver)result.getTestContext().getAttribute("Guru");
	String filename = result.getName();
	String path = "D:\\Guru99\\data\\"+filename+".png";			
			TakesScreenshot ss =(TakesScreenshot)driver;
	        File source = ss.getScreenshotAs(OutputType.FILE);
	        File dest =new File(path);
	        
	        try {
	        	FileUtils.copyFile(source, dest);
	        	System.out.println("ss taken");
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }

}
@Override
public void onFinish (ITestContext context) {
	System.out.println("test finished");
}


}
