package methods;

public class Non_staticMethodStudy {

	public static void main(String[] args) {
		
      //classname objname= new classname();
	  //calling to non static method---> objname.methodname();
	  //creating object	
		Non_staticMethodStudy obj= new Non_staticMethodStudy();//created object for same class
		obj.display(); //calling non static method from same class
		MyClass m= new MyClass(); //created object for another class
		m.running();//calling non static method from another class
	}

	public void display()
	{System.out.println("Hi this is non static Display method from same class");
		
		
	}
}
