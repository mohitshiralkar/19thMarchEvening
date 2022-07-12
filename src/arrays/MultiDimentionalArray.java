package arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) 
	{
	  int a[][]=new int[2][2];
	  
	  a[0][0]=1;
	  a[0][1]=2;
	  a[1][0]=3;
	  a[1][1]=4;
	  
	  System.out.print(a[0][0]+" ");
	  System.out.println(a[0][1]);
	  System.out.print(a[1][0]+" ");
	  System.out.println(a[1][1]);
	  System.out.println("==================");
	  
	  for(int i=0;i<=a.length-1;i++)
	  {
		 for(int j=0;j<=a.length-1;j++)
		 {
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	  }
        
	  
	}

}
