package arrays;

public class ArrayStudy2 {

	public static void main(String[] args) {
		String name[]= {"RAM","SEETA","LAXMAN"};
         for(int i=0;i<=name.length-1;i++)
         {
        	System.out.println(name[i]); 
         }
        	 
       String s="I LOVE MY INDIA";
       
       String ar[]=s.split(" ");
       
       for(int i=0;i<=ar.length-1;i++)
       {
       System.out.println(ar[i]);
       }


}
}