package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="user_name")                  //declaration
private WebElement unTBX;

@FindBy(name="user_password")
private WebElement pwTBX;

@FindBy(id="submitButton")
private WebElement lgnBTN;
                                                                     //initialization
public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
                                                                     // utilization

public void setusername(){
	unTBX.sendKeys("admin");
}
public void setPassword(){
	pwTBX.sendKeys("password");
}
public void clicklgn(){
	lgnBTN.click();
}



}
