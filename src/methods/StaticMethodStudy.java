package methods;

public class StaticMethodStudy {

	public static void main(String[] args) {
		
     myMethod();//calling static regular method from same class
     method1(); //calling static regular method from same class
     Testingjava.display();//calling static regular method from another class
     class1.calculation();//calling static regular method from another class
	}
     public static void myMethod()
     {
    	 System.out.println("HI THIS IS MYMETHOD");
     } 
     public static void method1()
     
     {   System.out.println("THIS IS METHOD 1");
     
     }
}
