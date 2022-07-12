package interfaceStudy;

public interface Mother 
{
   void recipie();
   
   void care();
   
   default void money()
   {
	   System.out.println("Mothers money");
   }
   
   static void test()
   {
	   System.out.println("Mothers Test");
   }
   
   
}
   