package banking_stage2_exercise;

import java.util.Scanner;

public class NormalAccount extends Account {
	 
	public static int normalAccCnt = 0;

	public NormalAccount(String accNum, String name, int balance, int interestRate) {
        super(accNum, name, balance, interestRate);
//		Scanner scanner = new Scanner(System.in);
//		int choice = scanner.nextInt(); 
//		 scanner.nextLine();
		
//			// 계좌 개설을 위한 입력 받기
//			System.out.println("*** 보통계좌 개설 ***");
//			System.out.print("계좌번호:");
//			String accNum1 = scanner.nextLine();
//			System.out.print("고객이름:");
//			String name1 = scanner.nextLine();
//			System.out.print("초기 잔액: ");
//			int balance1 = scanner.nextInt();
//			System.out.print("기본 이자율(%): ");
//			int interestRate1 = scanner.nextInt();
			
			// 보통계좌 인스턴스 생성
			NormalAccount normalAccount = new NormalAccount(accNum, name, balance, interestRate);
			
			Account normalAccArr[]=new NormalAccount[50];

			normalAccArr[normalAccCnt++]=normalAccount;
			
			
		
//		Scanner scanner =new Scanner(System.in);
//		int choice = scanner.nextInt(); 
//		scanner.nextLine();
//		
//		switch(choice) {
//		case 1:
//			System.out.print("계좌번호:"); String accNum1 = scanner.nextLine();
//			System.out.print("고객이름:"); String name1 = scanner.nextLine();
//			System.out.print("잔고:"); int balance1 = scanner.nextInt();
//			System.out.print("기본이자%(정수형태로입력):"); int interestRate1 = scanner.nextInt();
//			NormalAccount normalAccount = new NormalAccount(accNum1, name1, balance1);
//			break;
//		case 2:
//			System.out.print("계좌번호:"); String accNum2 = scanner.nextLine();
//			System.out.print("고객이름:"); String name2 = scanner.nextLine();
//			System.out.print("잔고:"); int balance2 = scanner.nextInt();
//			System.out.print("기본이자%(정수형태로입력):"); int interestRate2 = scanner.nextInt();
//			System.out.print("신용등급(A,B,C등급):"); String creditGrade = scanner.nextLine();
//			break;
//		}
//		System.out.println("계좌개설이 완료되었습니다.");
		

	}

	

}
