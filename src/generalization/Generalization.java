package generalization;

public class Generalization {

	public static void main(String[] args) 
	{
		SBI s=new SBI();
		Axis a=new Axis();
		
		System.out.println("====================");
		s.SavingAccount();
		s.FD();
		s.Loan();
		s.yono();
		System.out.println("====================");
		a.SavingAccount();
		a.FD();
		a.Loan();
		a.CashDepositMachine();
	}

}
