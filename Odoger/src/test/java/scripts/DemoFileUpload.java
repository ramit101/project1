package scripts;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFileUpload {
static{
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
	
}
public static void main(String[]args) throws InterruptedException{
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://localhost/login.do");
	 driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	 
	 //now moving the driver to another tab
	 Set<String> tabs = driver.getWindowHandles();
	int no_tab = tabs.size();
	System.out.println(no_tab);
	for(String tab:tabs){
	driver.switchTo().window(tab)	;
	String title = driver.getTitle();
	if(title.equals("actiTIME - Time Tracking Software for Boosting Your Business")){
		WebElement hs = driver.findElement(By.xpath("//li[text()='Help Center']"));
		Actions act = new Actions(driver);
		act.moveToElement(hs).perform();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//p[text()='Contact support']")).click();
		
		int yasix = driver.findElement(By.xpath("//label[text()='Question']")).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+yasix+")");
		WebElement fp = driver.findElement(By.xpath("//input[@type()='file']"));
		act.click(fp).perform();
		StringSelection filepath = new StringSelection("D:\\Excel\\upload.txt");
		Toolkit tlk = Toolkit.getDefaultToolkit();
		Clipboard clp = tlk.getSystemClipboard();
		clp.setContents(filepath,null);
		System.out.println("lets paste");
	}
	}
	 
}
}
