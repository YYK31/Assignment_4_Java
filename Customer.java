package javaassignment3;

public class Customer {
	String name, address,mobileNo;
	Account account;
	
	
	public Customer(String name, String address, String mobileNo, Account account) {
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.account = account;
	}
	
	
	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
	public void withdraw(float amt) {
		account.withdraw(amt);
	}
	
	public void deposit(float amt){
		account.deposit(amt);
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + ", account=" + account
				+ "]";
	}
	
	
	
	
}
