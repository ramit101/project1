package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Base_Class;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductsPage;

public class TC_02_SearchProduct extends Base_Class {
	@Test
	public void searchProduct(){
LoginPage lp = new LoginPage( driver);
lp.setusername();
lp.setPassword();
lp.clicklgn();

HomePage hp = new HomePage(driver);
hp.click_products();

ProductsPage prod = new ProductsPage(driver);
prod.searchProduct();
prod.searchIN();
//prod.



	}
}
