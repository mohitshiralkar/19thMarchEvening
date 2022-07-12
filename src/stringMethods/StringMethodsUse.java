package stringMethods;

public class StringMethodsUse {

	public static void main(String[] args) {
		String name="Velocity";
		//length()method use
		System.out.println(name.length());
		int lengthOfString=name.length();
		System.out.println(lengthOfString);
		
		//toUpperCase() method use
		System.out.println(name);
		System.out.println(name.toUpperCase());
		String m=name.toUpperCase();
		System.out.println(m);
		
		//toLowerCase() method use
		System.out.println(name.toLowerCase());
		String n=name.toLowerCase();
		System.out.println(n);
		
		//equals() method use
		String a="Velocity";
		String b="Velocity";
		String c=new String("Velocity");
		String d=new String("Velocity");
		String e=new String("VELOCITY");
		// === compares memory locations of two operators
		// equals method compare character sequence of two objects
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println("===========");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(e));
		System.out.println("===========");
		boolean result=a.equals(c);
	    System.out.println(result);
	    System.out.println(d.equals(e));// checking character sequence along with 
	                                    //case sensitivity
	  //equalsIgnoreCase() method use
	    String city="Pune";
	    String locality="Pune";
	    String district="pune";
	    System.out.println("===========");
	    System.out.println(city.equals(district));
	    System.out.println(city.equals(locality));
	    System.out.println(city.equalsIgnoreCase(district));
	    System.out.println("===========");
	    
	  //contains() method use
	    String k="Katraj";
	    
	    System.out.println(k.contains("Ka"));
	    System.out.println(k.contains("ar"));
	    
	    System.out.println("===============");
	  //isEmpty() method use
	    String p="Test";
	    String q=" ";
	    String r=null;
	    String s="";
	    
	    System.out.println(q.length());
	   // System.out.println(r.length());
	    System.out.println(p.isEmpty());
	    System.out.println(q.isEmpty());
	    //System.out.println(r.isEmpty());
	    System.out.println(s.isEmpty());
	    
	    System.out.println("=================");
	    //isBlank() method use
	  //System.out.println(r.isBlank());
	    System.out.println(p.isBlank());
	    System.out.println(q.isBlank());
	    System.out.println(s.isBlank());
	    System.out.println("=================");
	    
	    // charAt method use
	    String country="INDIA";
	    System.out.println(country.charAt(0));
	    System.out.println(country.charAt(4));
	   
	    char requiredChar = country.charAt(0);
	    System.out.println(requiredChar);
	    
	    System.out.println("=================");
	  //endsWith method use
	    System.out.println(country.endsWith("DIA"));
	    System.out.println(country.endsWith("AI"));
	    
	    System.out.println("=================");
	  //startsWith method use
	    System.out.println(country.startsWith("IND"));
	    System.out.println(country.startsWith("ND"));
	    
	    System.out.println(country.startsWith("A", 4));
	    System.out.println(country.startsWith("I", 0));
	    
	    System.out.println("=================");
	    
	  //substring method use
	    String testing="VELOCITY CORPORATE TRAINING CENTER";
	    String resultString = testing.substring(28);
	    System.out.println(resultString);
	    System.out.println(testing.substring(9));
	    
	    System.out.println(testing.substring(9, 18));
	    String resultofString=testing.substring(9, 18);
	    System.out.println(resultofString);
	    
	    System.out.println("====================");
	    
	  //concat method study
	    String x="DHULE ";
	    String y="CITY";
	    
	    System.out.println(x.concat(y).concat(" OLD DHULE"));
	    System.out.println("====================");
	    
	  //indexOf method use
		  String state="Maharashtra";
		  System.out.println(state.indexOf('t'));
		  System.out.println(state.indexOf("r"));
		  System.out.println(state.indexOf('a', 6));
		  System.out.println(state.lastIndexOf('a'));
		  
		  System.out.println("====================");
		//replace method use
		  String tal="Pune Mumbai Nagpur";
		  System.out.println(tal.replace('P','M'));
		  System.out.println(tal.replace("Pu", "Mt"));
		  System.out.println(tal.replaceAll(" ", "="));
		  
		  System.out.println("====================");
		 //string split method
		// I Love My India
		  String s1="I LOVE MY INDIA";
	       
	       String ar[]=s1.split(" ");
	       
	       for(int i=0;i<=ar.length-1;i++)
	       {
	       System.out.println(ar[i]);
	       }
	       System.out.println("====================");
	       
	       String z="THIS_IS_MY_COUNTRY";
	       String tu[]=z.split("_");
	       
	       for(int i=0;i<=tu.length-1;i++)
	       {
	    	   System.out.println(tu[i]);
	       }
	       
	       
		 
		  
	    
	    
	    
	    
	    
	    
	    
	    


		
		

		

	}

}
