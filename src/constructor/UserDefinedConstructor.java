package constructor;

public class UserDefinedConstructor {
	public UserDefinedConstructor()//user defined without/zero parameter constructor
	{
		System.out.println("I am user defined constructor");
		int a=20;
		int b=30;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		
	}
	public static void main(String[] args) {
	 UserDefinedConstructor td=new UserDefinedConstructor();//object of a class is created
	 td.test();		 

	}
    public void test()
    {
    	System.out.println("Hi i am test method");
    }
}
