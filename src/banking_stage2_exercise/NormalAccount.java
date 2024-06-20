package banking_stage2_exercise;

public class NormalAccount extends Account {
	

	//생성자
	public NormalAccount(String accNumber, String name, int balance, int interestRate) {
		
	}
	
	//입금
	public void deposit(int amount) {
		if(amount>0) {
			balance = balance +(balance*interestRate/100)+amount;
			System.out.println(amount +"원 입금되었습니다.");
		}
		else {
			System.out.println("입금할 금액을 확인해주세요");
		}
	}
	
	//출금
	public void withdraw(int amount) {
		if(amount>0 && balance >= amount) {
			balance -= amount;
			System.out.println(amount +"원 출금되었습니다.");

		}
		else {
			System.out.println("출금할 금액을 확인해주세요");
		}
	}
	
	
	//
	
	
}

 