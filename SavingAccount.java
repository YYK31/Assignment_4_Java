package javaassignment3;

public class SavingAccount {
	static double InterestRate = 0;
	private double balance;

	public  SavingAccount() {
		balance = 0;
	}

	public  SavingAccount(double balance) {
		this.balance = balance;
	}

	public void calculateMonthlyInterest() {
		double interest = (balance * InterestRate) / 12;
		System.out.println("monthly interest:" + interest);
		balance += interest;
	}

	public static void modifyInterestRate(double ir) {
		InterestRate = ir;
	}
	
	public double getBalance() {
		return balance;
	}
}
