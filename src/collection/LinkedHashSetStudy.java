package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	
	hs.add("Dhule");
	hs.add("Dhule");
	hs.add(null);
	hs.add(null);
	hs.add(23);
	hs.add(43.12);
	hs.add(true);
	hs.add('M');	
		
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(23));
	
//	for(int i=0;i<=hs.size()-1;i++)
//	{
//	  System.out.println(hs.get(i));
//	}
    System.out.println("======================");
	for(Object w:hs)
	{
		System.out.println(w);
	}
	System.out.println("======================");
	
	Iterator u = hs.iterator();
	while(u.hasNext())
	{
		System.out.println(u.next());
	}
	System.out.println("======================");
	
	LinkedHashSet<Integer> lh1= new LinkedHashSet<>();
	lh1.add(310);
	lh1.add(256);
	lh1.add(200);
	lh1.add(760);
	lh1.add(998);
	System.out.println(lh1);
	
	System.out.println("======================");
	for(Integer t:lh1)
	{
		System.out.println(t);
	}
	
	}
	
	
	}


