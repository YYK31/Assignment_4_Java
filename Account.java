package javaassignment3;

public class Account {
	long accountNo;
	float balance;
	
	public Account() {
		
	}

	public Account(long accountNo, float balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	
	public void withdraw(float amt){
		if(amt<balance) {
			balance-=amt;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	public void deposit(float amt){
		if(amt>0) {
			balance+=amt;
			System.out.println(amt+" deposited successful");
		}
		else
		{
			System.out.println(" amount should be grater than 0");
		}
	}
	
	public float getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}

	
	
	
}
