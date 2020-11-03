package parallel;
import java.util.ArrayList;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Object {
@Test
public void objectmethods(){
	Object obj = new Object();
	System.out.println(obj);
	System.out.println(obj.hashCode());
	System.out.println(obj.toString());	
}
@Test
public void tc_02(){
	String[] str = new String[5];
	str[0]="sector 18";
	str[1]="sector 16";
	str[2]="sector 15";
	str[3]="sector 12";
	str[4]="yamuna bank";
//	str[5]="noida E city";
	
	for(int i=0;i<=4;i++){
		System.out.println(str[i]);
	}	
}
@Test
public void tc_03(){
ArrayList<Metro> arlist = new ArrayList<Metro>();
Reporter.log("**********************************",true);
arlist.add(new Metro("New Delhi"));
arlist.add(new Metro("lal bagh"));
arlist.add(new Metro("yamuna bank"));
arlist.add(new Metro("rajeev chowk"));
arlist.add(new Metro("yamuna bank"));
arlist.size();
for(Metro st:arlist){
	System.out.println(st);
}
}




}
