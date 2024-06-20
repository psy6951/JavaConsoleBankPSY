package banking_stage2_exercise;
 
import java.util.Scanner;

public class AccountManager {

	public static Account accArr[]=new Account[50];
	public static int accCnt = 0;
	public static int index = 0;
   
    
	public static void showMenu() {
		System.out.println("----- Menu-----");
		System.out.println("1.계좌개설");
		System.out.println("2.입  금");
		System.out.println("3.출  금");
		System.out.println("4.계좌정보출력");
		System.out.println("5.프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	//개좌개설을 위한 함수
	public static void makeAccount() {
		System.out.println("==makeAccount()호출됨");
		
		
		System.out.println("***신규계좌개설***");
		System.out.println("-----계좌선택-----");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		Scanner scanner =new Scanner(System.in);
		

		int choice = scanner.nextInt(); 
		scanner.nextLine();
		
		switch(choice) {
		case 1:
			System.out.print("계좌번호:"); String accNum1 = scanner.nextLine();
			System.out.print("고객이름:"); String name1 = scanner.nextLine();
			System.out.print("잔고:"); int balance1 = scanner.nextInt();
			System.out.print("기본이자%(정수형태로입력):"); int interestRate1 = scanner.nextInt();
			System.out.println("계좌개설이 완료되었습니다.");
			break;
		case 2:
			System.out.print("계좌번호:"); String accNum2 = scanner.nextLine();
			System.out.print("고객이름:"); String name2 = scanner.nextLine();
			System.out.print("잔고:"); int balance2 = scanner.nextInt();
			System.out.print("기본이자%(정수형태로입력):"); int interestRate2 = scanner.nextInt();
			System.out.print("신용등급(A,B,C등급):"); String creditGrade = scanner.nextLine();
			System.out.println("계좌개설이 완료되었습니다.");
			break;
		}
		
		
		
		
		
//		System.out.println("계좌번호:"); String accNum = scanner.nextLine();
//		System.out.println("고객이름:"); String name = scanner.nextLine();
//		System.out.println("잔고:"); int balance = scanner.nextInt();
//		System.out.println("계좌개설이 완료되었습니다.");
		
//		Account account= new Account(accNum, name, balance);
//		accArr[accCnt++]= account;

	}

	
	public static int retrieveIndexByAccountNumber(String accNum){
        for(int i=0; i<accCnt; i++){
            if(accArr[i].getAccountNumber().equals(accNum)){
                return i;
            }              
        }return -1;
    }
	
	//입금을 위한 함수
	public static void depositMoney() {
		System.out.println("==depositMoney()호출됨");
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("***입   금***");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.println("계좌번호:"); String accNum = scanner.nextLine();
		System.out.println("입금액:"); int depositAmount = scanner.nextInt();
		scanner.nextLine();
		
		int index = retrieveIndexByAccountNumber(accNum);
        if(index != -1){           
        	accArr[index].deposit(depositAmount);
        }else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
		
		System.out.println("입금이 완료되었습니다.");
	}
	

	//출금을 위한 함수
	public static void withdrawMoney() {
		System.out.println("==withdrawMoney()호출됨");
		Scanner scanner =new Scanner(System.in);

		System.out.println("***출   금***");
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		System.out.println("계좌번호:");  String accNum = scanner.nextLine();
		System.out.println("출금액:"); int withdrawAmount = scanner.nextInt();
		scanner.nextLine();
		
		
		int index = retrieveIndexByAccountNumber(accNum);
        if(index != -1){           
        	accArr[index].withdraw(withdrawAmount);
        }else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
		
		System.out.println("출금이 완료되었습니다.");

	}
	
//	public static void newAccount() {
//		Scanner scanner =new Scanner(System.in);
//
//		System.out.println("계좌번호:"); String accNum = scanner.nextLine();
//		System.out.println("고객이름:"); String name = scanner.nextLine();
//		System.out.println("잔고:"); int balance = scanner.nextInt();
//		
//		Account account= new Account(accNum, name, balance);
//		accArr[accCnt++]= account;
//	
//	}
	
	
	//전체계좌정보출력을 위한 함수
	public static void showAccInfo() {
		System.out.println("==showAccInfo()호출됨");
		System.out.println("***계좌정보출력***");
		System.out.println("----------");

		for(int i=0 ; i<accCnt ; i++) {
			accArr[i].showAccount();
		}
		
		System.out.println("전체정보가 출력되었습니다");
	}
	
	
}


