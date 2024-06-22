package banking_stage5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AccountManager {
	HashSet<Account> hashSet = new HashSet<Account>();
//	public Account accArr[]=new Account[50];
//	public static int accCnt = 0;
	Account account=null;
	
	
//	public AccountManager() {}
	
	public AccountManager() {
	   }
	
	public void showMenu() {
		System.out.println("==================Menu=================");
		System.out.print(" 1.계좌개설   ");
		System.out.print("2.입금   ");
		System.out.print("3.출금   ");
		System.out.println("4.계좌정보출력   ");
		System.out.print(" 5.계좌정보삭제   ");
		System.out.println("6.프로그램종료");
		System.out.println("=======================================");
		System.out.print("메뉴선택>>>");
	}

	//개좌개설을 위한 함수
	public void makeAccount() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("==makeAccount()호출됨");
		System.out.println("***신규계좌개설***");
		System.out.println("-----계좌선택------");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		System.out.print("선택: ");
		int accountType = scanner.nextInt();
		scanner.nextLine();
		
		if(!(accountType==1 ||accountType==2)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print("계좌번호: "); String accNumber = scanner.nextLine();
        System.out.print("고객이름: "); String name = scanner.nextLine();
        System.out.print("잔고: "); int balance = scanner.nextInt();
        System.out.print("기본이자%(정수형태로입력): "); int interestRate = scanner.nextInt();
        scanner.nextLine(); 
		
		if(accountType==1) {
//			accArr[accCnt++]=new NormalAccount(accNumber, name, balance, interestRate);
//			accArr[accCnt++]= normal;
			account = new NormalAccount(accNumber, name, balance, interestRate);
		}
		else if(accountType==2) {
			System.out.print("신용 등급 (A, B, C 등급): "); String creditGrade = scanner.nextLine();
			if(creditGrade.equalsIgnoreCase("a") || creditGrade.equalsIgnoreCase("b") || creditGrade.equalsIgnoreCase("c")) {
//				accArr[accCnt++] = new HighCreditAccount(accNumber, name, balance, interestRate, creditGrade);
				account= new HighCreditAccount(accNumber, name, balance, interestRate, creditGrade);
				
			}
			else {
			System.out.println("잘못입력하셨습니다.");
			}
		}
		
		boolean yn=hashSet.add(account);
		if(yn==true) {
			System.out.println("계좌개설이 완료되었습니다.");		
		}
		else {
			System.out.println("중복된 인스턴스가 발견되었습니다.");
			System.out.println("덮어쓸까요?(Y/N)");
			
			String con = scanner.nextLine();
			if(con.equalsIgnoreCase("Y")) {
				hashSet.remove(account);
				hashSet.add(account);
				System.out.println("새로운 정보로 갱신되었습니다.");
			}
			else if(con.equalsIgnoreCase("N")) {
				System.out.println("계좌개설이 취소되었습니다.");
				return;
			}
			else {
				System.out.println("Y/N으로 응답하세요.");
				return;
			}
		}
	} ////end of makeAccount
	
	
//	public int retrieveIndexByAccountNumber(String accNumber){
//        for(int i=0; i<accCnt; i++){
//            if(accArr[i].getAccNumber().equals(accNumber)){
//                return i;
//            }              
//        }return -1;
//    }
	
	//계좌번호로 계좌찾기
	public Account findAccount(String accNumber) {
        for (Account account : hashSet) {
            if (account.getAccNumber().equals(accNumber)) {
                return account;
            }
        }
        return null; 
    }
	
	
	
	//입금을 위한 함수
	public void depositMoney() {
		System.out.println("==depositMoney()호출됨");
		Scanner scanner =new Scanner(System.in);
	
		System.out.println("***입   금***");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.print("계좌번호: "); String accNumber = scanner.nextLine();
		System.out.print("입금액: "); int amount = scanner.nextInt();
//		scanner.nextLine();
		
		
		
//		int index = retrieveIndexByAccountNumber(accNumber);
//        if(index != -1){           
//        	accArr[index].deposit(amount);
//
//        }else{
//            System.out.println("계좌번호가 존재하지 않습니다.");
//            return;
//        }
		
		//해당계좌가 있으면 입금실행
		Account account = findAccount(accNumber);
		if(account !=null) {
			account.deposit(amount);
		}
		else{
          System.out.println("계좌번호가 존재하지 않습니다.");
          return;
      }
       
	}
	

	//출금을 위한 함수
	public void withdrawMoney() {
		System.out.println("==withdrawMoney()호출됨");
		Scanner scanner =new Scanner(System.in);
		System.out.println("***출   금***");
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		System.out.print("계좌번호: ");  String accNumber = scanner.nextLine();
		System.out.print("출금액: "); int amount = scanner.nextInt();
		scanner.nextLine();
		
//		hashSet account.accNumber
		
		
//		int index = retrieveIndexByAccountNumber(accNumber);
//        if(index != -1){           
//        	accArr[index].withdraw(amount);
//        }else{
//            System.out.println("계좌번호가 존재하지 않습니다.");
//            return;
//        }
		
		//해당계좌가 있으면 출금실행
		Account account = findAccount(accNumber);
		if(account !=null) {
			account.withdraw(amount);
		}
		else{
          System.out.println("계좌번호가 존재하지 않습니다.");
          return;
      }
	}
	

	
	//전체계좌정보출력을 위한 함수
	public void showAccInfo() {
		System.out.println("==showAccInfo()호출됨");
		System.out.println("***계좌정보출력***");

//		for(int i=0 ; i<accCnt ; i++) {
//			System.out.println("----------");
//			accArr[i].showAccount();
//		}
		for(Account account: hashSet) {
			System.out.println("----------");
			account.showAccount();
		}
		
		System.out.println("----------");
		System.out.println("전체정보가 출력되었습니다");
		
	}

	//계좌정보삭제를 위한 함수
	public void deleteAccInfo() {
		Scanner scanner =new Scanner(System.in);

		System.out.println("==deleteAccInfo()호출됨");
		System.out.println("***계좌정보삭제***");
		System.out.println("***삭제할 계좌번호를 입력하세요***");
		System.out.print("삭제할 계좌번호: ");
		String accNumber = scanner.nextLine();

		Account account = findAccount(accNumber);
		if(account !=null) {
			hashSet.remove(account);
			System.out.println("계좌정보가 삭제되었습니다.");
		}
		else{
          System.out.println("계좌번호를 확인해주세요");
          return;
      }
		
	}
	
}
