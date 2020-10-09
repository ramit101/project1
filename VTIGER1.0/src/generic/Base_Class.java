package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
@BeforeClass
public void openBrowser(){
driver=	new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
}
@BeforeMethod
public void openApplication(){
	driver.get("http://localhost:8888/");
}
@AfterMethod
public void closeApplication(){
	
}
@AfterClass
public void closeBrowser(){
	
}
}
