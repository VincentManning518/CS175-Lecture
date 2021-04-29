
public class SavingAccount {

	String name;
	double balance, monthlyFee;
	
	public SavingAccount(String userName, double userBalance, double userFee)
	{
		name = userName;
		balance = userBalance;
		monthlyFee = userFee;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void addInterest(double interestRate)
	{
		balance = balance + (balance * interestRate);
	}
	
	public void endofMonth()
	{
		balance = balance - monthlyFee;
	}
	
}
