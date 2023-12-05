package revise_pgm;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable
{
	int age;
	String name;
	double salary;
	public Emp(int age,
	String name,
	double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		return this.age-e.age;
	}

}

public class compareable {

	public static void main(String[] args) {
	Emp e1=new Emp(11,"simha",89000);
	Emp e2=new Emp(12,"tiger",99000);
	Emp e3=new Emp(14,"lion",67000);
	ArrayList a=new ArrayList();
	a.add(e1);
	a.add(e2);
	a.add(e3);
	Collections.sort(a);
	for(Object o:a)
	{
		System.out.println(o);
	}
	

	}

}
