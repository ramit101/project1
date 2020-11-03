package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	//setting the driver executable
	static{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver.exe");
	}
	public WebDriver driver;
@BeforeClass
public void openBrowser(){
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
}
@BeforeMethod
public void openApplication(){
	driver.get("https://www.flipkart.com/");
}
@AfterMethod
public void closeApplication(ITestResult result) throws IOException{
	int status = result.getStatus();
	String tcname = result.getName();
	if(status==1){
		Takescreenshot.screenshot(driver,tcname);
	}
	
}
@AfterClass
public void closeBrowser(){
	
}
}
