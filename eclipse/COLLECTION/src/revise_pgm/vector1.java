package revise_pgm;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(21);
		v.add(78.9);
		v.add('a');
		v.add("hello");
		v.add(true);
		System.out.println(v);
//		Object[] o=v.toArray();
//		for(int i=0;i<o.length;i++)
//		{
//			System.out.println(o[i]);
//		}
		System.out.println(v.capacity());
	}

}
