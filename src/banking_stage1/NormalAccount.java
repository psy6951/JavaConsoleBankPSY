package banking_stage1;

public class NormalAccount extends Account {

	public NormalAccount(String accNum, String name, int deposit) {
		super(accNum, name, deposit);

	}

	@Override
	public void showAccInfo() {
		System.out.println("===고딩친구(전체정보)===");
		super.showAccInfo();
		
		
		System.out.println("계좌번호:"+ accNum);
		System.out.println("고객이름:"+ name);
		System.out.println("잔고:"+ deposit);
		System.out.println("----------");
		System.out.println("전체계좌정보 출력이 완료되었습니다.");
	}
	
	


}
