package test_scripts;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Base_Class;
import generic.DropDown;
import pom.Create_ProductPage;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductsPage;

public class login_logout  extends Base_Class{
@Test(invocationCount=0)
public void tc1(){

	LoginPage lgn = new LoginPage(driver);
	lgn.setusername();
	lgn.setPassword();
	lgn.clicklgn();
	
	HomePage hp = new HomePage(driver);
	hp.click_products();
	
	ProductsPage prodpge = new ProductsPage(driver);
	prodpge.createProducts();
	
	Create_ProductPage crprod = new Create_ProductPage(driver);
	crprod.addProductName();
	crprod.selectuser();
	crprod.selectHandler();
	crprod.saveProduct();
	

}

@Test()
public void takeScreenShot(){
	Reporter.log("hello now in @test",true);
}
}
