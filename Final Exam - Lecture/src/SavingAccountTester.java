import java.util.Scanner;
public class SavingAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Please input the name of the owner of the account: ");
		String name = in.nextLine();
		
		System.out.print("Please enter the initial balance you wish to deposit: ");
		double initial = in.nextDouble();
		
		System.out.print("Please input the monthly fee of the account: ");
		double fee = in.nextDouble();
		
		SavingAccount myAccount = new SavingAccount(name, initial, fee);
		
		System.out.print("Please input the interest rate for the account: ");
		double rate = in.nextDouble();
		
		System.out.println("Adding interest...");
		myAccount.addInterest(rate);
		
		System.out.println("Charging monthly fee...");
		myAccount.endofMonth();
		
		System.out.println("Owner: " + myAccount.getName());
		System.out.println("Current Balance: $" + myAccount.getBalance());
		
	}

}
