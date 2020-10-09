package generic;

import org.openqa.selenium.interactions.Actions;

public class Actions_Class extends Base_Class{
public void double_click(){
	Actions act = new Actions(driver);
	act.doubleClick();
	
}
}
