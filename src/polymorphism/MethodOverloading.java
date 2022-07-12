package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		//Declaring multiple methods with same method name but with 
	    //different argument in a same class is called 	method overloading.
		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(50, 80);
		mo.add(10, 20, 30);
		

	} 
    public void add()
    {
    	int a=12;
    	int b=30;
    	int sum=a+b;
    	System.out.println("Addition is "+sum);
    }
    
    public void add(int a, int b)
    
    {   int sum=a+b;
    	System.out.println("Addition is "+sum);
    }
    
    public void add(int a, int b, int c)
    {
    	int sum=a+b+c;
    	System.out.println("Addition is "+sum);
    }
}
