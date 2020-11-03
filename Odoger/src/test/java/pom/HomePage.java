package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
@FindBy(xpath="//span[text()='Men']")                //finding the element
private WebElement elem;                              //storing the element
@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
private WebElement button;
@FindBy(xpath="//a[@title='Ethnic wear']")
private WebElement ethnic;

public HomePage(WebDriver driver){                     //notifying the JVM to create an object &initialising
	PageFactory.initElements(driver, this);
}
public void click_module(WebDriver driver){
	Actions action = new Actions(driver);
	action.moveToElement(elem).build().perform();
	
}
public void close_login(){
button.click();
}
public void click_ethnic(){
	ethnic.click();
}
}
