package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Grandmother gm=new Grandmother();
		gm.recipie();
		Grandmother.stories();
		
		Mother m=new Mother();
		m.nature();
		m.recipie();
		Mother.care();
		Mother.stories();
		
		Child c=new Child();
		c.mobile();
		c.nature();
		c.recipie();
		
	}

}
