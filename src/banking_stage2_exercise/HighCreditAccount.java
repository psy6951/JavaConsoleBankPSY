package banking_stage2_exercise;

public class HighCreditAccount extends Account {
	
	int interestRate;
	String creditGrade;

	//생성자
	public HighCreditAccount(String accNumber, String name, int balance, int interestRate, String creditGrade) {
		super(accNumber, name, balance);
		this.interestRate=interestRate;
		this.creditGrade=creditGrade;
	}


	@Override
	//입금
	public void deposit(int amount) {
		
	}
	
	//출금
	public void withdraw(int amount) {
		
	}

}

 