package banking_stage2;


public class Account {
	
	public String accNum;
	public String name;
	public int balance;
	public int interestRate;
	

	public Account() {}
	public Account(String accNum, String name, int balance, int interestRate) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
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
		System.out.println("계좌번호>"+ this.accNum);
		System.out.println("고객이름>"+ this.name);
		System.out.println("잔고>"+ this.balance);
		System.out.println("----------");
	}
	
	public String getAccountNumber() {
        return accNum;
	}
	
}


