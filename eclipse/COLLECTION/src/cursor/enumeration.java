package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		v.add(29);
		v.add(89);
		v.add(75);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		

	}

}
