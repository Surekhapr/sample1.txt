package ARRAYLIST;

import java.util.ArrayList;

public class array1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("abc");
	a.add("hello");
	a.add(85);
	a.add(25);
	a.add(null);
//	System.out.println(a);
	//System.out.println(a.size());
	//a.add(0,1);
//	System.out.println(a);
	//System.out.println((a.isEmpty()));
//	System.out.println(a.size());
//	System.out.println(a.contains(77));
	
	ArrayList a2=new ArrayList();
	a2.add("abc");
	a2.add("hello");
	a2.add('a');
	a2.add(26);
	//a.removeAll(a2);
	//a.containsAll(a2);
	a2.add(66);
	a2.remove(0);
	//System.out.println(a);
	System.out.println((a2));

			
	
	
	
}
}
