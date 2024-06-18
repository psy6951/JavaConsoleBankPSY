package banking;

import java.util.Scanner;

public class AccountManager {
	
	
	
	public void makeAccount() {
		Scanner scan =new Scanner(System.in);
		String iAccNum, iName, iBalance;
		System.out.println("계좌번호:"); iAccNum = scan.nextLine();
		System.out.println("이름:"); iName = scan.nextLine();
		System.out.println("잔고:"); iBalance = scan.nextLine();
	}
	
	
	
	
	public void depositMoney() {
		Scanner scan =new Scanner(System.in);
		String iAccNum, iDeposit;
		
		System.out.println("***입   금***");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.println("계좌번호:"); iAccNum = scan.nextLine();
		System.out.println("입금액:"); iDeposit = scan.nextLine();
		System.out.println("입금이 완료되었습니다.");

	}
	
	public void withdrawMoney() {
		Scanner scan =new Scanner(System.in);
		String iAccNum, iWithdrawal;

		System.out.println("***출   금***");
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		System.out.println("계좌번호:"); iAccNum = scan.nextLine();
		System.out.println("출금액:"); iWithdrawal = scan.nextLine();
		System.out.println("출금이 완료되었습니다.");


	}
	
	public void showAccInfo() {
		String accNum;
		String name;
		int balance;
		
		Account[] accounts = null ;
		int numOfAccounts = 0 ;
		
		for(int i=0 ; i<numOfAccounts ; i++) {
			accounts[i].showAccInfo();
		}
			
			System.out.println("***계좌정보출력***");
			System.out.println("계좌번호:"+ accNum);
			System.out.println("잔고:"+ balance);
			System.out.println("----------");
			System.out.println("전체정보가 출력되었습니다");
		}
	
	}
}


