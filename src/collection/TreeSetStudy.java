package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	
	ts.add(888);
	ts.add(98);
	//ts.add(null);
	ts.add(12);
	ts.add(43);
	ts.add(5);
	ts.add(11);
	//ts.add("Dhule");
	
     System.out.println(ts);
     
//     for(int i=0;i<=ts.size()-1;i++)
//     {
//    	 System.out.println(ts.get(i));
//     }
     System.out.println("===================");
     
     for(Object h:ts)
     {
    	 System.out.println(h);
     }
     System.out.println("===================");
     
     Iterator r = ts.iterator();
     while(r.hasNext())
     {
    	System.out.println(r.next()); 
     }
     
	}

}
