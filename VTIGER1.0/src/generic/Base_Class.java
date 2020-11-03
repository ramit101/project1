package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_Class {
	static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
@BeforeClass
public void openBrowser(){
driver=	new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//driver.manage().window().maximize();
driver.get("http://localhost:8888/");
}
@BeforeMethod
public void m1(){
	System.out.println("******************************");
}

@AfterMethod
public void m2(){
	System.out.println("******************************");
}

@AfterClass
public void closeBrowser(){
	Reporter.log("browser closed",true);
}

}
