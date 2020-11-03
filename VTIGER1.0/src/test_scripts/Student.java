package test_scripts;

import java.util.TreeSet;

public class Student {

	public static void main(String[] args) {
		
TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(15);
ts.add(12);
ts.add(10);
ts.add(20);
for(Object obj:ts){
	System.out.println(obj);
}

	}

}
