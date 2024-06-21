package banking_stage3_exercise;

public class NormalAccount extends Account {
	
	int interestRate;
	
	//생성자
	public NormalAccount(String accNumber, String name, int balance, int interestRate) {
		super(accNumber, name, balance);
		this.interestRate=interestRate;
	}
	
	@Override
	//입금
	public void deposit(int amount) {
		if(amount>0) {
			balance = balance +(balance*interestRate/100)+amount;
		}
		else {
			System.out.println("입금할 금액을 확인해주세요");
		}
		System.out.println("입금이 완료되었습니다.");

	}
	
	//출금
	public void withdraw(int amount) {
		if(amount>0 && balance >= amount) {
			balance -= amount;

		}
		else {
			System.out.println("출금할 금액을 확인해주세요");
		}
	}
	//
	//계좌정보출력
	public void showAccount() {
		super.showAccount();
		System.out.println("기본이자>"+ this.interestRate);
	}

	
}

 