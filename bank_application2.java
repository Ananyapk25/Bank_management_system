package com.practice;
class Account{
	int accountNumber;
	double balance;
	Account(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	double getBalance() {
		return balance;
	}
	void deposit(double amount) {
		if(amount<0) {
			System.out.println("Invalid");
		}
		else {
		balance=balance+amount;
		}
	
	}
	void withdraw(double amount) {
		if(amount<0||amount>balance) {
			System.out.println("Invalid");
		}
		else {
			balance=balance-amount;
		}
		
	}
	double calculateInterest() {
		return 0.0;
	}
	
}
class SavingsAccount extends Account{
	double interestRate;
	SavingsAccount(int accountNumber,double balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
		double calculateInterest() {
			return balance*interestRate;
		}
		
	}
 class CheckingAccount extends Account{
	 double monthlyFee;
	 CheckingAccount(int accountNumber,double balance,double monthlyFee){
			super(accountNumber,balance);
			this.monthlyFee=monthlyFee;
		}
	 double calculateInterest() {
			return 0.0;
		}
 }
	
public class bank_application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SavingsAccount sa=new SavingsAccount(12345,500,7);
      CheckingAccount ca=new CheckingAccount(12345,500,150);
     double interest1= sa.calculateInterest();
     double interest2=ca.calculateInterest();
     System.out.println(interest1);
     System.out.println(interest2);
      
      
	}

}
