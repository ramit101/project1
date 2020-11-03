package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class rev {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/geckodriver.exe");
	}
	public static WebDriver driver;
@Test
public void tc_chrome(){
	driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
}
@Test
public void tc_firefox(){
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
}




}
