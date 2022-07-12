package interfaceStudy;

public interface Father
{ 
	void love();
	
	void nature();
	
	default void money()
	{
		System.out.println("Fathers money");
	}
     static void test()
     {
    	 System.out.println("Fathers Test");
     }
}
