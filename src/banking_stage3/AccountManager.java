package banking_stage3;

import java.util.Scanner;

public class AccountManager {
	
//	String accNumber;
//	String name;
//	int balance;
//	int interestRate;
//	String creditGrade;

	private Account accArr[]=new Account[50];
	public static int accCnt = 0;

	
	public AccountManager() {}
	
    
	public void showMenu() {
		System.out.println("----- Menu-----");
		System.out.println("1.계좌개설");
		System.out.println("2.입  금");
		System.out.println("3.출  금");
		System.out.println("4.계좌정보출력");
		System.out.println("5.프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	//개좌개설을 위한 함수
	public void makeAccount() {
//		String accNumber;
//		String name;
//		int balance;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("==makeAccount()호출됨");
		System.out.println("***신규계좌개설***");
		System.out.println("-----계좌선택------");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		int accountType = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("계좌번호: "); String accNumber = scanner.nextLine();
        System.out.print("고객이름: "); String name = scanner.nextLine();
        System.out.print("잔고: "); int balance = scanner.nextInt();
        System.out.print("기본이자%(정수형태로입력): "); int interestRate = scanner.nextInt();
        scanner.nextLine(); 
		
		if(accountType==1) {
			Account normal  = new NormalAccount(accNumber, name, balance, interestRate);
			accArr[accCnt++]= normal;
			System.out.println("계좌개설이 완료되었습니다.");
		}
		else if(accountType==2) {
			System.out.print("신용 등급 (A, B, C 등급): "); String creditGrade = scanner.nextLine();
			if(creditGrade.equalsIgnoreCase("a") || creditGrade.equalsIgnoreCase("b") || creditGrade.equalsIgnoreCase("c")) {
				accArr[accCnt++] = new HighCreditAccount(accNumber, name, balance, interestRate, creditGrade);
				System.out.println("계좌개설이 완료되었습니다.");
			}
			else {
			System.out.println("잘못입력하셨습니다.");
			}
		}
	} ////end of makeAccount
	
	
	public int retrieveIndexByAccountNumber(String accNumber){
        for(int i=0; i<accCnt; i++){
            if(accArr[i].getAccountNumber().equals(accNumber)){
                return i;
            }              
        }return -1;
    }
	
	//입금을 위한 함수
	public void depositMoney() {
		System.out.println("==depositMoney()호출됨");
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("***입   금***");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.println("계좌번호:"); String accNumber = scanner.nextLine();
		System.out.println("입금액:"); int amount = scanner.nextInt();
		scanner.nextLine();
		
		int index = retrieveIndexByAccountNumber(accNumber);
        if(index != -1){           
        	accArr[index].deposit(amount);

        }else{
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
		System.out.println("계좌번호:");  String accNumber = scanner.nextLine();
		System.out.println("출금액:"); int amount = scanner.nextInt();
		scanner.nextLine();
		
		
		int index = retrieveIndexByAccountNumber(accNumber);
        if(index != -1){           
        	accArr[index].withdraw(amount);
        }else{
            System.out.println("계좌번호가 존재하지 않습니다.");
            return;
        }
		System.out.println("출금이 완료되었습니다.");
	}
	
	//전체계좌정보출력을 위한 함수
	public void showAccInfo() {
		System.out.println("==showAccInfo()호출됨");
		System.out.println("***계좌정보출력***");

		for(int i=0 ; i<accCnt ; i++) {
			System.out.println("----------");
			accArr[i].showAccount();
		}
		
		System.out.println("----------");
		System.out.println("전체정보가 출력되었습니다");
	}
	
}
