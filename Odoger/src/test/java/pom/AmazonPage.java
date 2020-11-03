package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
@FindBy(xpath="//a[text()='Mobiles']")//finding 
private WebElement elemt;//storing

public AmazonPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
public void clickfeature(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(elemt).build().perform();
}

}
