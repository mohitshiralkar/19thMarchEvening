package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
      Mother m=new Mother();
      Mother.care();
      m.nature();
      
      Child c=new Child();
      c.mobile();
      Child.laptop();
      
      c.nature();
      Child.care();
	}

}
