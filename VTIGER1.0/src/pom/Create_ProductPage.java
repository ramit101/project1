package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_ProductPage {
@FindBy(xpath="//input[@name='productname']") //finding
public WebElement prodtName;                                //storing

@FindBy(xpath="(//input[@type='radio'])[3]")
private WebElement user;

@FindBy(xpath="(//select[@class='small'])[7]")
private WebElement handler;
@FindBy(xpath="//input[@value='  Save  ']")
private WebElement save;

public Create_ProductPage(WebDriver driver){        
	PageFactory.initElements(driver,this);                 //object creation & initialization	
}

public void addProductName(){
	prodtName.sendKeys("IPHONE 11 PRO");
}
public void selectuser(){
	user.click();
}
public void selectHandler(){	
	Select sel = new Select(handler);	
	List<WebElement> optin = sel.getOptions();
	for(WebElement ele: optin){
		String stt = ele.getText();
		System.out.println(stt);
}
	}
public void saveProduct(){
	save.click();
}
}
