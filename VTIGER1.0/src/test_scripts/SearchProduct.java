package test_scripts;

import org.testng.annotations.Test;

import generic.Base_Class;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductsPage;

public class SearchProduct extends Base_Class {
//login in to the appl with valid login credentials
	@Test
	public void search_prdNO_tc_01(){
	LoginPage lp = new LoginPage(driver);
	lp.setusername();
	lp.setPassword();
	lp.clicklgn();
	
	HomePage hp = new HomePage(driver);
	hp.click_products();
	
	ProductsPage pnam = new ProductsPage(driver);
	pnam.search_productName();
	pnam.searchby();
	pnam.click_searchnow();
	}
}
