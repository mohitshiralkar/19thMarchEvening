package constructor;

public class CC2 {
	int a; //variable declaration
	int b; //variable declaration
	public CC2() //user defined zero parameter constructor
	{
		a=300; //Initialize variable
		b=400; //Initialize variable
	}
    public CC2(int x) //user defined with single parameter constructor
    {
    	a=x;
    }
    public CC2(int x,int y) //user defined with double parameter constructor
    {
    	a=x;
    	b=y;
  	
    }
	public static void main(String[] args) {
		CC2 rs=new CC2();//Created object using zero parameter constructor
		rs.add();
		
		CC2 rt=new CC2(600);// created object using single parameter constructor
		rt.add();
		
		CC2 sr=new CC2(60,80);// created object using two parameter constructor
		sr.add();
		
	}
    public void add() 
    {
    	int add=a+b;
    	System.out.println("Addition is "+add);
    }
}
