package methods;

public class MathOperation {

	public static void main(String[] args) {
	MathOperation mo= new MathOperation();//object created	
	
	mo.add();//calling non static method from same class
	sub(); //calling static method from same class
	sample.mul();//calling static method from another class
	sample r=new sample();//created object of another class
	r.div();//calling non static method from another class
	

	}
    
	public void add() //without parameter
	{
		int a;
		int b;
		int addition;
		
		a=100;// assign value
		b=200;
		 
		addition=a+b;
		
		System.out.println("addition is "+addition);
		 
		}
	public static void sub()
	{
		int a=200; //1+2 variable declaration+assign
		int b=100;
		int sub=a-b;
		System.out.println("substraction is "+sub);
	}
}
