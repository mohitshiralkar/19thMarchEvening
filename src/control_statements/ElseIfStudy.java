package control_statements;

public class ElseIfStudy {

	public static void main(String[] args) {
		// if your marks >=66--> You are in dist
		//elseif marks >=60 <66--> You are in 1st class
		//elseif marks >=50 <60--> You are in 2nd class
		//elseif marks>=40 and <50 --> You are just pass
		//else --> you are fail
	
        int marks= 77;
        
        if(marks>=66)
        {
        	System.out.println("You are in distinction");
        }
        else if (marks>=60 & marks<66) 
        {
			System.out.println("You are in 1st class");
		}
        else if (marks>=50 & marks<60)
        {
			System.out.println("You are in 2nd class");
		}
        else if (marks>=40 & marks<50) 
        {   System.out.println("You are just pass");
			
		}
        else {
			System.out.println("You are fail");
		}
	}  

	   
	}


