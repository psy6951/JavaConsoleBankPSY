package banking_stage1;

import java.util.Scanner;

public class Account {
	
	String accNum;
	String name;
	int balance;
	public static Account accArr[]=new Account[50];
	public static int accCnt = 0;
	
 

	public Account() {}
	public Account(String accNum, String name, int balance) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	
	
	public void deposit(int money) {
		if(money>0) {
			balance += money;
		}
		else {
			System.out.println("입금할 금액을 확인해주세요");
		}
	}
	
	public void withdraw(int money) {
		if(money>0 && balance >= money) {
			balance -= money;
		}
		else {
			System.out.println("출금할 금액을 확인해주세요");
		}
	}
	
	public void showAccount() {
		System.out.println("계좌번호:"+ this.accNum);
		System.out.println("고객이름:"+ this.name);
		System.out.println("잔고:"+ this.balance);
		System.out.println("----------");
	}
	
	public String getAccountNumber() {
        return accNum;
	}
	
}

