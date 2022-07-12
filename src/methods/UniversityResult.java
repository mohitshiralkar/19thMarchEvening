package methods;

public class UniversityResult {

	public static void main(String[] args)
	{
	 	UniversityResult uv=new UniversityResult();//object creation
	 	uv.studentInfo();//calling method without parameters
	 	uv.StudentInfo1("Mohit",76,'A',360.56d);//calling method with parameter
	 	uv.StudentInfo1("Rahul",98,'C',777.55d);
	 	
	}
    public void studentInfo()//method without parameters
      {
    	//name, rollNum, grade, totalMarks
    	
    	String StudentName="Mohit"; //1+2
    	int RollNum=76;
    	char grade='A';
    	float totalMarks=350.20f;
    	
    	System.out.println("====================================");
    	System.out.println("Student name is "+StudentName);
    	System.out.println("Student's Roll number is "+RollNum);
    	System.out.println("Student's grade is "+grade);
    	System.out.println("Student's total marks is "+totalMarks);
    	System.out.println("====================================");
    }
     //name, rollNum, grade, totalMarks
    //method with parameters
    public void StudentInfo1(String StudentName, int RollNum, char grade, double totalMarks)
     {
    	System.out.println("====================================");
    	System.out.println("Student name is "+StudentName);
    	System.out.println("Student's Roll number is "+RollNum);
    	System.out.println("Student's grade is "+grade);
    	System.out.println("Student's total marks is "+totalMarks);
    	System.out.println("====================================");
    }
    
    
    
    
    
    
}
