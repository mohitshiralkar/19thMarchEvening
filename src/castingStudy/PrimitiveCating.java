package castingStudy;

public class PrimitiveCating {

	public static void main(String[] args) 
	{
		int a=10;//lower data type information
		System.out.println(a);
		
		double b=a;//converted to higher data 
		//type info-- Implicit casting or  wideing casting
		System.out.println(b);
		
		double c=600.21456;//higher data type
		System.out.println(c);
		
		int d=(int)c;;// converted to lower 
		//type info--explicit casting or narrowing casting
		
        System.out.println(d);
		
	}

}
