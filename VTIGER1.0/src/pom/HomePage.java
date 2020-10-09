package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(xpath="//a[text()='Products']")
public WebElement products;

public HomePage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void click_products(){
	products.click();
}

}
