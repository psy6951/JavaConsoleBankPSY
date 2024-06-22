package banking_stage4;

import java.util.Scanner;

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
		
		if(amount>0 && amount%500==0) {
			balance = balance +(balance*interestRate/100)+amount;
			System.out.println("입금이 완료되었습니다.");
		}
		else if(amount<=0){
			System.out.println("입금액은 0보다 커야 합니다.");
		}
		else if(amount%500!=0){
			System.out.println("입금은 500원 단위로만 가능합니다.");
		}
		else {
			System.out.println("입금할 금액을 확인해주세요");
		}
	}
	
	//출금
	public void withdraw(int amount) {
		if(amount>0 && balance >= amount && amount%1000==0) {
			balance -= amount;
			System.out.println("출금이 완료되었습니다.");
		}
		else if (balance<amount){
			System.out.println("잔고가 부족합니다. 금액전체를 출금할까요?(Y/N)");
			Scanner scanner = new Scanner(System.in);
			String yn = scanner.nextLine();
			if(yn.equalsIgnoreCase("Y")) {
				//금액전체 출금처리
				balance = 0;
				System.out.println("출금이 완료되었습니다.");
			}
			else if(yn.equalsIgnoreCase("N")) {
				//출금요청취소
				System.out.println("출금이 취소되었습니다.");
			}
		}
		else if(amount<=0){
			System.out.println("출금액은 0보다 커야 합니다.");
		}
		else if(amount%1000!=0){
			System.out.println("출금은 1000원 단위로만 가능합니다.");
		}
		else {
			System.out.println("출금할 금액을 확인해주세요");
		}
	}
	//
	//계좌정보출력
	public void showAccount() {
		super.showAccount();
		System.out.println("기본이자> "+ this.interestRate+"%");
	}

	
}

 