package generalization;

public class SBI implements RBI{

	@Override
	public void SavingAccount() {
		System.out.println("SBI saving acc interest rate is 4.5%");
		
	}

	@Override
	public void FD() {
		System.out.println("SBI FD interest rate is 7%");
		
	}

	@Override
	public void Loan() {
		System.out.println("SBI loan interest rate is 9%");
		
	}
	
	public void yono()
	{
		System.out.println("SBI yono mobile banking app");
	}

}
