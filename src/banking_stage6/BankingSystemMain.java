package banking_stage6;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BankingSystemMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AccountManager am = new AccountManager();
		am.readFile();
		
		while(true) {
			
			am.showMenu();
			int choice = scanner.nextInt(); 

			try {
				switch(choice) {
	
				case ICustomDefine.MAKE:
					System.out.println("계좌개설 선택");
					am.makeAccount();
					break;	
				case ICustomDefine.DEPOSIT:
					System.out.println("입금 선택");
					am.depositMoney();
					break;	
				case ICustomDefine.WITHDRAW:
					System.out.println("출금 선택");	
					am.withdrawMoney();
					break;
				case ICustomDefine.INQUIRE:
					System.out.println("계좌정보출력 선택");	
					am.showAccInfo();  
					break;
				case ICustomDefine.DELETE:
					System.out.println("계좌정보삭제 선택");	
					am.deleteAccInfo();  
					break;
				case ICustomDefine.EXIT:
					am.saveFile();
					System.out.println("프로그램종료");
					return;
				default:
					MenuSelectException ex = new MenuSelectException();
					throw ex;
					//default 다음에는 실행할 문장이 없으므로 break는 생략한다.
				}
			}
			catch (MenuSelectException e) {
				System.out.println("메뉴는 1~6까지의 숫자로 입력하세요");
			}
			catch(InputMismatchException e){
				System.out.println("숫자로만 입력하세요");
			} 
		}
	}
}
