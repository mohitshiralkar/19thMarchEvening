package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Mohit");
	al.add('A');
	al.add("Velocity");
	al.add(null);
	al.add(null);
	al.add(129);
	al.add(126.566);
	al.add(true);
	al.add(false);
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains("Mohit"));
	System.out.println(al.get(5));
	System.out.println(al.indexOf(126.566));
	System.out.println(al.remove(2));
	System.out.println(al);
	al.add(2,"Pune");
	System.out.println(al);
	
	System.out.println("===================");
	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("===================");
	Iterator it = al.iterator();
    
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("===================");
	
	ListIterator lit = al.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	System.out.println("===================");
	for(Object h:al)
	{
		System.out.println(h);
	}
	ArrayList<Integer>at=new ArrayList();
	at.add(22);
	at.add(67);
	at.add(88);
	at.add(77);
	
	for(Integer q:at)
	{
		System.out.println(q);
	}
	System.out.println("===================");
	ArrayList<Character>ch=new ArrayList<>();
	ch.add('A');
	ch.add('M');
	ch.add('W');
	ch.add('Y');
	
	for(Character u:ch)
	{
		System.out.println(u);
	}
	System.out.println("===================");
	
	Iterator<Character> it1 = ch.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	
	}
	
	

}
