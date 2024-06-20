package banking_stage2_exercise;

import java.util.Scanner;

public class Account {
	
	String accNumber;
	String name;
	int balance;
//	int interestRate;
//	String creditGrade;
	
	public static Account accArr[]=new Account[50];
	public static int accCnt = 0;
	
 
	public Account() {}
	public Account(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
//		this.interestRate=interestRate;
//		this.creditGrade=creditGrade;
	}
	
	public void deposit(int amount) {}
	public void withdraw(int amount) {}
	
	public void showAccount() {
		System.out.println("계좌번호>"+ this.accNumber);
		System.out.println("고객이름>"+ this.name);
		System.out.println("잔고>"+ this.balance);
//		System.out.println("기본이자>"+ this.interestRate);
//		System.out.println("신용등급>"+ this.creditGrade);
	}
	
	public String getAccountNumber() {
        return accNumber;
	}
	
	public int getBalance() {
        return balance;
    }
	
}

