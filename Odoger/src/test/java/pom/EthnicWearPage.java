package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EthnicWearPage {
@FindBy(xpath="//div[text()='Brand']")
private WebElement brand;
@FindBy(xpath="//div[text()='Peter England']")
private WebElement pEngland;

public EthnicWearPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void chooseBrand(){
	  pEngland.click();
	
	
}
}
