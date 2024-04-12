package javaassignment3;

import java.io.Serial;

public class TestSavingAccount {

	public static void main(String[] args) {
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		
		
		SavingAccount.modifyInterestRate(0.03);
		saver1.calculateMonthlyInterest();
		System.out.println("balance:"+saver1.getBalance());
		System.out.println("--------------------");
		saver2.calculateMonthlyInterest();
		System.out.println("balance:"+saver2.getBalance());
		
		System.out.println("-----------------------------------");
        System.out.println("after intrest modify");
		
		SavingAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		System.out.println("balance:"+saver1.getBalance());
		System.out.println("--------------------");

		saver2.calculateMonthlyInterest();
		System.out.println("balance:"+saver2.getBalance());
	}

}
