package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
@FindBy(xpath="//img[@title='Create Product...']")
public WebElement addprodt;

@FindBy(xpath="//input[@class='txtBox']")  //finding
public WebElement search;                         //storing

@FindBy(id="bas_searchfield")
public WebElement in;

@FindBy(xpath="//input[@name='search_text']") //finding the searchfor text field
private WebElement searchfor;

@FindBy(name="submit")
private WebElement searchNow;

public ProductsPage(WebDriver driver){        //object creation and initilization
	PageFactory.initElements(driver,this);
}

public void createProducts(){
	addprodt.click();
}
public void searchProduct(){
	search.sendKeys("IPHONE 11 PRO");
}
public void searchIN(){
	Select sel = new Select(in);
	sel.selectByVisibleText("Product No");
	List<WebElement> lis = sel.getOptions();
	for(WebElement wel:lis){
	String ss = wel.getText();
	System.out.println(ss);
	    } 
	}
public void searchby(){
	searchfor.sendKeys("Vtiger 5 Users Pack");
}
public void search_productName(){
	Select sel = new Select(in);
	sel.selectByVisibleText("Product Name");
	
	}
public void click_searchnow(){
	searchNow.click();
}


}
