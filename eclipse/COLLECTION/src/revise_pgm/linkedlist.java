package revise_pgm;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(89);
		l.add('a');
		l.add("hello");
		l.add(true);
		l.add(false);
//		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l);
System.out.println(l.poll());
		System.out.println(l);
	}

}
