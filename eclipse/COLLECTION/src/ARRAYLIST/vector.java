package ARRAYLIST;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add('a');
		v.add(25.25);
		v.add(25);
		v.add(null);
		System.out.println(v);
		System.out.println(v.capacity());
		
	}

}
