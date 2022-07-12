package finalKeywordUse;

public class Sample extends Test
{ 	public static void main(String[] args) {
		Sample s=new Sample();
		Test t=new Test();
		s.demo();
		t.demo();
		
	}
	public void demo()
	{
		System.out.println("Hi i am demo method from sample class");
	}

}
