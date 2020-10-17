package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot {
	
	public static void screenshot(WebDriver driver) throws IOException{
		String photo="./screenshot/";
		Date d = new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":","-" );
		
		
 TakesScreenshot ts = (TakesScreenshot)driver; //typecasting the driver from webdriver to Takescreenshot
File src = ts.getScreenshotAs(OutputType.FILE);
 File dest = new File(photo+date+".png");
 FileUtils.copyFile(src, dest);
	}
}
