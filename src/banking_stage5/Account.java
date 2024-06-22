package banking_stage5;

import java.util.Scanner;

public class Account {
	// 계좌번호(String형), 이름(String형), 잔액(int형) 
	String accNumber;
	String name;
	int balance;
	//생성자
	public Account() {}
	public Account(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) {}
	public void withdraw(int amount) {}
	//정보출력용 메서드 
	public void showAccount() {
		System.out.println("계좌번호> "+ this.accNumber);
		System.out.println("고객이름> "+ this.name);
		System.out.println("잔고> "+ this.balance+"원");
	}
	
	
	
	public int getBalance() {
        return balance;
    }
	
	public String getAccNumber() {
		return accNumber;
	}
	
	// equals()와 hashCode() 메소드 오버라이드
	@Override
	public int hashCode() {
		return accNumber.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Account acc= (Account)obj;
		if(acc.accNumber.equals(this.accNumber)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

