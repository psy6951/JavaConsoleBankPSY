package bankingT1;

public class Account {
	
	//계좌번호(String형), 이름(String형), 잔액(int형)
	public String accNumber;
	public String name;
	public int balance;
	
	//생성자
	public Account() {}
	public Account(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}

	//정보출력용 메서드
	public void showAccount() {
		
		System.out.println("***계좌정보출력***");
		System.out.println("계좌번호:"+ this.accNumber);
		System.out.println("이름:"+ this.name);
		System.out.println("잔액:"+this.balance);
	}
	
}
