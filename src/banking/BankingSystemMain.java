package banking;

import java.util.Scanner;


public class BankingSystemMain {
	
	public static void showMenu() {
		System.out.println("----- Menu-----");
		System.out.println("1.계좌개설");
		System.out.println("2.입  금");
		System.out.println("3.출  금");
		System.out.println("4.계좌정보출력");
		System.out.println("5.프로그램종료");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AccountManager handler = new AccountManager();
		 
		
		while(true) {
			showMenu();
			int choice = scan.nextInt(); 
			
			switch(choice) {
			
			case 1:
				handler.makeAccount();
				break;	
			case 2:
				handler.depositMoney();
				break;	
			case 3:
				handler.withdrawMoney();
				break;
			case 4:
				handler.showAccInfo();
				break;
			case 5:
				System.out.println("프로그램종료");
				/*
				 main메서드가 종료된다는 것은 프로그램 전체의 종료로 이어진다.
				 */
				return;
			}
		}
	}
}
