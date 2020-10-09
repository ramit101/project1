package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public void select_handler(WebElement wel, int index){
	Select sel = new Select(wel);
	sel.selectByIndex(index);
}
public void select_handler(WebElement wel,  String arg0){
	Select sel = new Select(wel);
	sel.selectByVisibleText(arg0);;
}
public void select_handler(WebElement wel){
	Select sel = new Select(wel);	
	List<WebElement> optin = sel.getOptions();
	for(WebElement ele: optin){
		String stt = ele.getText();
		System.out.println(stt);
	}
	
}





}