package banking_stage3;


public class HighCreditAccount extends Account {
	
	int interestRate;
	String creditGrade;
	
	//생성자
	public HighCreditAccount(String accNumber, String name, int balance, int interestRate, String creditGrade) {
		super(accNumber, name, balance);
		this.interestRate=interestRate;
		this.creditGrade =creditGrade;
	}
	
	@Override
	//입금
	public void deposit(int amount) {
		
		if(amount>0) {
			if(creditGrade.equalsIgnoreCase("A")){
				balance += (balance*interestRate/100)+(balance*7/100)+amount;
			}
			else if(creditGrade.equalsIgnoreCase("B")){
				balance += (balance*interestRate/100)+(balance*4/100)+amount;
			} 
			else if(creditGrade.equalsIgnoreCase("C")){
				balance += (balance*interestRate/100)+(balance*2/100)+amount;
			} 
			
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
	
	//계좌정보출력
	public void showAccount() {
		super.showAccount();
		System.out.println("기본이자>"+ this.interestRate);
		System.out.println("신용등급>"+ this.creditGrade);
	}
	
		
		
}
