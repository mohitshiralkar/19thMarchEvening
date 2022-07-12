package thisAndSuperKeywordUse;

public class SuperUse extends ThisUse{
	
	int a=600;

	public static void main(String[] args)
	{
		SuperUse su=new SuperUse();
		su.substraction();
		
	}
	
	public void substraction()
	{
		int a=40;
		int sub=a-20;
	    System.out.println("Substraction is "+sub);
		
		int sub1=this.a-20;
		System.out.println("Substraction is "+sub1);
		
		int sub2=super.a-10;
		System.out.println("Substraction is "+sub2);
	}

}
