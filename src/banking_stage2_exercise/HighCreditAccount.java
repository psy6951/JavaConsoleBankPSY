package banking_stage2_exercise;

import java.util.Scanner;

public class HighCreditAccount extends Account {
	 private String accountType; // 계좌 유형
	    private String creditGrade; // 신용 등급

	    // 생성자
	    public HighCreditAccount(String accNum, String name, int balance, int interestRate, String creditGrade) {
	        super(accNum, name, balance, interestRate);
//	        this.accountType = "신용신뢰계좌";
	        this.creditGrade = creditGrade;
	        this.deposit(balance); // 초기 잔액 입금 처리
	    }

	    // 계좌 유형 조회 메서드 (오버라이드)
	    public void showAccountType() {
	        System.out.println("계좌 유형: " + accountType + ", 신용 등급: " + creditGrade);
	    }

	    // 신용 등급 반환 메서드
	    public String getCreditGrade() {
	        return creditGrade;
	    }
	 

	// 메인 클래스
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 계좌 개설을 위한 입력 받기
	        System.out.println("*** 신용신뢰계좌 개설 ***");
	        System.out.print("계좌번호: ");
	        String accNum2 = scanner.nextLine();
	        System.out.print("고객이름: ");
	        String name2 = scanner.nextLine();
	        System.out.print("초기 잔액: ");
	        int balance2 = scanner.nextInt();
	        System.out.print("기본 이자율(%): ");
	        int interestRate2 = scanner.nextInt();
	        System.out.print("신용 등급(A, B, C 등급):");
	        String creditGrade = scanner.nextLine();

	        // 신용신뢰계좌 객체 생성
	        HighCreditAccount highCreditAccount = new HighCreditAccount(accNum2, name2, balance2, interestRate2, creditGrade);

	        // 계좌 기능 테스트
//	        highCreditAccount.deposit(10000); // 예금
//	        highCreditAccount.withdraw(5000); // 출금
//	        highCreditAccount.calculateInterest(12); // 이자 계산
//	        highCreditAccount.checkBalance(); // 잔액 조회
//	        highCreditAccount.printAccountInfo(); // 계좌 정보 출력
//	        highCreditAccount.showAccountType(); // 계좌 유형 및 신용 등급 출력

	        scanner.close();
		
		
		
		
		
		
		
		
		
		
	}
		

}
