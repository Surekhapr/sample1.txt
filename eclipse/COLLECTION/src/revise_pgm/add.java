package revise_pgm;

import java.util.ArrayList;

public class add {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(25);
		a.add("abc");
		a.add(true);
		a.add(85);
		a.add(25);
		
		ArrayList a2=new ArrayList();
		a2.add(26);
		a2.add("abc");
		a2.add(true);
		a2.add('a');
		
	
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a.removeAll(a2));
//		System.out.println(a.retainAll(a2));
		
		
	}

}
