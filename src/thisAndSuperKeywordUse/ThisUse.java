package thisAndSuperKeywordUse;

public class ThisUse {
	
	int a=100;
	static int b=20;

	public static void main(String[] args)
	{
		ThisUse tu=new ThisUse();
		tu.addition();

	}

    public void addition()
{   int b=60;
	int a=15;
	int sum=a+60;
	System.out.println("Addition is "+sum);
	
	int sum1=this.a+60;
	System.out.println("Addition is "+sum1);
	
	System.out.println("Local variable is "+a);
	System.out.println("Global variable is "+this.a);
	
	int sum3=b+70;
	System.out.println("Addition is "+sum3);
	
	 int sum4=this.b+30;
	 System.out.println("Addition is "+sum4);

}   
   
   
}