package javaassignment3;

public class Bank {
	static double interest=0.07;
	static final int MAX_SIZE=10;
	static int  size=0;
	int i;
	boolean flag=false;
	Account account[]=new Account[MAX_SIZE];
	Customer customer[]=new Customer[MAX_SIZE];
	
	
	public void add(String name, String address, String mobileNo, float balance ) {
		if(size<MAX_SIZE) {
			long accNo=UtilAccountNo.getaccNo();
			account[size]=new Account(accNo, balance);
			customer[size]=new Customer(name, address, mobileNo, account[size]);
		    size++;
		}
		else {
			System.out.println("Bank is Full");
		}
	}
	
	public void display(String name) {
		for ( i = 0; i < size; i++) {
			if(customer[i].getName()==name) {
				System.out.println(customer[i].toString());
			}
		}
	}
	
	public void delete(long acNo) {
		for ( i = 0; i < size; i++) {
			if(customer[i].getAccount().accountNo==acNo) {
			System.out.println("customer deleted of account no"+acNo);
			customer[i]=customer[size-1];
			size--;
			flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("customer not found of account no"+acNo);
		}
	}
	
	public void diplayall() {
		for ( i = 0; i < size; i++) {
				System.out.println(customer[i].toString());
		}
	}
	
	public void deposit(long acNo,float amt) {
		for ( i = 0; i < size; i++) {
			if(customer[i].getAccount().accountNo==acNo) {
			   customer[i].deposit(amt);
			flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("customer not found of account no"+acNo);
		}
	}
	
	
	public void witdraw(long acNo,float amt) {
		for ( i = 0; i < size; i++) {
			if(customer[i].getAccount().accountNo==acNo) {
			   customer[i].withdraw(amt);
			flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("customer not found of account no"+acNo);
		}
	}
}



