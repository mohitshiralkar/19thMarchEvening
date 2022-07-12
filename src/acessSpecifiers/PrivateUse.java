package acessSpecifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{ 
		PrivateUse pu=new PrivateUse();
		pu.test1();
		pu.test2();
		pu.test3();
		pu.test4();
		
		
	}
	private void test1()
	{
		System.out.println("Hi this is private test1 method");
	}
	void test2()
	{
		System.out.println("Hi this is default test 2 method");
	}

	protected void test3()
	{
		System.out.println("Hi this is protected test3 method");
	}
	public void test4()
	{
		System.out.println("Hi this is public test 4 method");
	}

}
