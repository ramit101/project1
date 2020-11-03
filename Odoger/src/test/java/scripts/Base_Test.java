package scripts;

import org.testng.annotations.Test;

import generic.Base_Class;
import pom.AmazonPage;
import pom.EthnicWearPage;
import pom.HomePage;

public class Base_Test extends Base_Class{
 @Test
 public void tc_01(){
	HomePage hp = new HomePage(driver);
	hp.close_login();
	
	hp.click_module(driver);
	hp.click_ethnic();
	
	EthnicWearPage ewp = new EthnicWearPage(driver);
	ewp.chooseBrand();
 }
 
 
}
