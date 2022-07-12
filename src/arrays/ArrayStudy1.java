package arrays;

public class ArrayStudy1 {

	public static void main(String[] args) {
		//Ram Seeta Laxman
		
		//array declaration
		
		String name[]=new String[3];
		
		//array initialization
		name[0]="Ram";
		name[1]="Seeta";
		name[2]="Laxman";
		
		//usage
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		System.out.println("=============");
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("=============");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("=============");
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
		
				

	}

}
