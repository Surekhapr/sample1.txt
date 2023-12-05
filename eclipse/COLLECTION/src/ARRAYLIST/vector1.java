package ARRAYLIST;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add("hi");
	v.add("bye");
	v.add('a');
	v.add(98);
	v.add(22.99);
	v.add(null);
	v.add(true);
	System.out.println(v.capacity());
	
	

	}

}
