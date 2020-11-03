package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot {
public static void screenshot(WebDriver driver, String tcname) throws IOException{
	String path="./Screenshots/";
	Date dt = new Date();
	String date = dt.toString();
	String dat = date.replaceAll(":","-");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(path+dat+tcname+".png");
	FileUtils.copyFile(src, dst);
}
}
