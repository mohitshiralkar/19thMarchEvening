package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	
	ll.add("Dhule");
	ll.add('A');
	ll.add(124);
	ll.add(123.54);
	ll.add("Dhule");
	ll.add(null);
	ll.add(null);
	ll.add(true);
	
	System.out.println(ll);
	System.out.println(ll.getFirst());
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.getLast());
	System.out.println(ll.peek());
	System.out.println(ll);
	System.out.println(ll.peekLast());
	System.out.println(ll.poll());
    System.out.println(ll);
    System.out.println(ll.pollLast());
    System.out.println(ll);
    System.out.println(ll.pop());
    System.out.println(ll);
    System.out.println(ll.get(3));
    System.out.println("************************");
    
    for(int i=0;i<=ll.size()-1;i++)
    {
    	System.out.println(ll.get(i));
    }
    System.out.println("************************");
    for(Object t:ll)
    {
    	System.out.println(t);
    }
    
    System.out.println("************************");
    Iterator it=ll.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println("************************");
    ListIterator lit=ll.listIterator();
    while(lit.hasNext())
    {
    	System.out.println(lit.next());
    }
    
	}

}
