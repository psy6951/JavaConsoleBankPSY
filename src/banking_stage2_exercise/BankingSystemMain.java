package banking_stage2_exercise;

import java.util.Scanner;

public class BankingSystemMain {
	
	public static Account accArr[]=new Account[50];
	public static int accCnt = 0;
	public static int index = 0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			AccountManager.showMenu();
			int choice = scanner.nextInt(); 

			switch(choice) {

			case ICustomDefine.MAKE:
				System.out.println("계좌개설 선택");
				AccountManager.makeAccount();
				break;	
			case ICustomDefine.DEPOSIT:
				System.out.println("입금 선택");
				AccountManager.depositMoney();
				break;	
			case ICustomDefine.WITHDRAW:
				System.out.println("출금 선택");	
				AccountManager.withdrawMoney();
				break;
			case ICustomDefine.INQUIRE:
				System.out.println("전체계좌정보 선택");	
				AccountManager.showAccInfo();
				break;
			case ICustomDefine.EXIT:
				System.out.println("프로그램종료");
				return;
			}
		}
	}
}
