package banking_stage3;

import java.util.Scanner;

public class Account {
	
	String accNumber;
	String name;
	int balance;
	
 
	public Account() {}
	public Account(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) {}
	public void withdraw(int amount) {}
	
	public void showAccount() {
		System.out.println("계좌번호>"+ this.accNumber);
		System.out.println("고객이름>"+ this.name);
		System.out.println("잔고>"+ this.balance);
	}
	
	public String getAccountNumber() {
        return accNumber;
	}
	
	public int getBalance() {
        return balance;
    }
	
}

