package oop;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() {
		this("default phone", 2.50, "default name","default email");
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(String phoneNumber, double balance, String customerName, String email) {
		this.balance = balance;
		this.customerName = customerName;
		this.email =email;
		this.phoneNumber = phoneNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setEmail(String email) {
		this.email =email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber= phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public double depositFunds(double amount) {
		if(amount > 0 ) {
			balance += amount;
			System.out.println(amount + " was deposited. Current balance is " + balance);
			return balance;
		} else {
			System.out.println("Not a valid amount to deposit");
			return balance;
		}
	}
	
	public double withdrawFunds(double amount) {
		
		if(amount > 0 && balance - amount > 0) {
			balance -= amount;
			System.out.println(amount + " was withdrawn. Current balance is " + balance);
			return balance;
		} else {
			System.out.println("Not a valid amount");
			return balance;
		}
	}
	

}
