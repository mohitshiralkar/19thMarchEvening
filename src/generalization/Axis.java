package generalization;

public class Axis implements RBI{

	@Override
	public void SavingAccount() {
		System.out.println("Axis saving acc interest rate is 5%");
		
	}

	@Override
	public void FD() {
		System.out.println("Axis FD interest rate is 6.7%");
		
	}

	@Override
	public void Loan() {
		System.out.println("Axis loan interest rate is 10%");
		
	}
	
	public void CashDepositMachine()
	{
		System.out.println("Axis bank CDM Machine");
	}

}
