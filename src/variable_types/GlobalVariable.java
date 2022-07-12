package variable_types;

public class GlobalVariable {

	int a=10;
	static int b=60;
	public static void main(String[] args) {
	
	GlobalVariable gv=new GlobalVariable();//created object
	gv.test();//calling non static method
	test1();//calling static method
	
	System.out.println("Value of a is "+gv.a);//calling non static global variable-->objname.variablename
	System.out.println("Value of b is "+b);//calling static global variable from same class-->variablename
	
	//call non static variable from another class
	Sample e=new Sample();//created object for another class
	System.out.println("Global non static variable from another class is "+e.p);
	System.out.println("Global static variable from another class is "+Sample.q);
	
	int sub=800-gv.a;//using non static variable from same class
	int sub1=700-b;//using static variable from same class
	
	int sub2=600-e.p;//using non static global variable from another class
	int sub3=900-Sample.q;//using static global variable from another class
	
	System.out.println("Sub is "+sub);
	System.out.println(sub1);
	System.out.println(sub2);
	System.out.println(sub3);
	

	}
public void test() //non static method
{
	
	int a=990;//local variable
	int sum=a+50;//we can call non static global variable
	int sub=b-30;//we can call static global variable
}
public static void test1() //static method
{
	//int sum=a+50; //we can't call non static global variable
	int sub=b-30; //we can call non static global variable
	System.out.println("Substraction is "+sub);
	
}
}
