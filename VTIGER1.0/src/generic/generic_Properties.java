package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class generic_Properties {
	
public String fewData(String url) throws FileNotFoundException, IOException{
	 Properties p = new Properties();
	 p.load(new FileInputStream("./src/generic/p1.properties"));
	String value = p.getProperty(url);
	 Reporter.log(value,true);
	 return value;
}
}
