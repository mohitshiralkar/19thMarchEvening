package castingStudy;

public class Son extends Father
{
   public void car() //Overriding
   {
	   System.out.println("Honda City");
   }
   
   public void bike() //Overriding
   {
	   System.out.println("Shine");
   }
   
   public void degree() //new method of Son--> not supported for casting
   {
	   System.out.println("BE");
   }
}
