package control_statements;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		// if username is correct---> Enter password
		// {
		// if--> password is correct-->login success
		// else--> enter correct password
		// }
		//else -->enter correct username
		
		String UN="Symboisis";
		String PWD="Symboisis@123";
		
		if(UN=="Symboisis")
		{
			System.out.println("Enter Password");
		
		if (PWD=="Symboisis@123") 
		{   
			System.out.println("Login sucess");
		}	
		
		else
		{
			System.out.println("Enter correct password");
		}
		
		
}
	   else 
	{
		   System.out.println("Enter correct username");
	} 
	}
	
}


