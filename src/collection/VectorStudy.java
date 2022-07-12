package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
	Vector v=new Vector();
	
	v.add("Dhule");
	v.add('M');
	v.add("Dhule");
	v.add(null);
	v.add(null);
	v.add(345);
	v.add(765.123);
	v.add(false);
	
	System.out.println(v);
	System.out.println("===================");
	System.out.println(v.size());
	System.out.println(v.isEmpty());
	System.out.println(v.remove(0));
	System.out.println(v);
	System.out.println(v.get(4));
	System.out.println("===================");
	
	//1.for loop
	for(int i=0;i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("===================");
	
	//2.for each loop
	for(Object y:v)
	{
		System.out.println(y);
	}
	System.out.println("===================");
	
	//3.Iterator
	Iterator it = v.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("===================");
	
	//4.ListIterator
	ListIterator lit = v.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	System.out.println("===================");
	
	//5.Enumeration
	Enumeration el =v.elements();
	while(el.hasMoreElements())
	{
		System.out.println(el.nextElement());
	}
	}

}
