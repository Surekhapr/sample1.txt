package ARRAYLIST;

import java.util.ArrayList;

public class arrlist {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(25);
	a.add("abc");
	a.add(true);
	a.add(85);
	a.add(25);
	ArrayList a1=new ArrayList();
	a1.add(26);
//	a1.add("abc");
	a1.add(true);
	a1.add(85);
	a1.add('a');
	boolean b=a.containsAll(a1);
	//System.out.println(b);
	//a.removeAll(a1);
	//a.containsAll(a1);
	//a.retaAll(a1);
//	a.retainAll(a1);
	
//	System.out.println(a);
//	System.out.println(a1);
	a.clear();
	System.out.println(a.isEmpty());
	}

}
