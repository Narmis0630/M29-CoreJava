package MoneyMoneyBank.framework;

public abstract class SavingAcc extends BankAcc {

	
	private boolean isSalaried;
	static final private float MINBAL=0.0f;
	
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	
	//methods
	public void withdraw(float accBal)
	{
		if(accBal > MINBAL) 
		{
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			this.setAccBal(getAccBal()-accBal);
			System.out.println("Account No: "+this.getAccNo()+", Account Name: "+this.getAccNm()+", Account Balance: "+this.getAccBal()+", Withdraw Amount:"+accBal);
		}
		else
		{
			System.out.println("Cannot Withdraw Minimum balance required is:"+ MINBAL);
		}	
	}
	//toString Method
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	
	
}