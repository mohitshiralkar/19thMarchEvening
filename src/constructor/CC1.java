package constructor;

public class CC1 {
	int a;
	int b;//Variable declaration
	
	public CC1()//User defined zero parameter
	{
		a=200; //Initialize variable
		b=300; //Initialize variable
	}

	public static void main(String[] args) {
	CC1 op=new CC1(); //The constructor is called when an object is created
	op.addition();
	op.multiplication();
	
	

	}
    public void addition()
    {
    	int sum=a+b;
    	System.out.println("Sum is "+sum);
    	
    }
    public void multiplication()
    {
    	int mul=a*b;
    	System.out.println("Multiplication is "+mul);
    }
}
