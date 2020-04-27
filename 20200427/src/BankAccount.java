
public class BankAccount {

	int myBal;
	
	/**
	 * 잔액확인 설명 적을수있음(/**으로 만듬)
	 */
	public void chkMyBal() {
		System.out.println("잔액: "+myBal);
	}
	public void depositMybal(int in) {
		myBal += in;
		System.out.println(in+"원 입금했습니다.");
	}
	public void withdraw(int out) {
		if(myBal<out) {
			System.out.println("출금 실패 잔액이 부족합니다.");
			return;
		}
		myBal -= out;
		System.out.println(out+"원 출금했습니다.");
	}
}
