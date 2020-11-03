package test_scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Base_Class;
import pom.LoginPage;

public class Failed_Screenshot extends Base_Class{
@Test
public void loginAppln(){
LoginPage lp = new LoginPage(driver);
lp.setusername();
lp.setPassword();
//Assert.fail("this test case is failed ....hard Assert");
SoftAssert sa = new SoftAssert();
sa.fail("this test case is fail but still login will happen");
lp.clicklgn();
sa.assertAll();
}
@Test
public void tc_02(){
	Reporter.log("this is second test case",true);
}

}
