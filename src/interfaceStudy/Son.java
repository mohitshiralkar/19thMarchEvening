package interfaceStudy;

public class Son implements Father,Mother{

	public static void main(String[] args)
	{
	  Son s=new Son(); // created object of Son class
	  s.recipie();
	  s.care();
	  s.love();
	  s.nature();
	  s.money();
	  Father.test(); // calling static method from fathers Interface
	  Mother.test(); // calling static method from mothers Interface
		
	}

	@Override
	public void recipie() {
		System.out.println("Mothers recipie completed in sons class");
	}

	@Override
	public void care() {
		System.out.println("Mothers care completed in sons class");
		
	}

	@Override
	public void love() {
		System.out.println("Fathers love completed in sons class");
		
	}

	@Override
	public void nature() {
		System.out.println("Fathers nature completed in sons class");
		
	}

	@Override
	public void money() {
		Father.super.money(); // super keyword is used to resolve calling issue
		Mother.super.money();
		
	}

}
