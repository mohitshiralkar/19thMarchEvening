package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	
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
	System.out.println(hs.contains(null));
	//System.out.println(hs.remove(null));
	System.out.println(hs);
	
	//for(int i=0;i<=hs.size()-1;i++)
	{
	//  System.out.println(hs.get(i));	
	}
	for(Object y:hs)
	{
		System.out.println(y);
	}
    System.out.println("=================="); 
	Iterator it = hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
