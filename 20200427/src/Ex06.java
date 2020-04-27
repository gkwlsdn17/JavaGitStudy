
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount();
		System.out.println(ba1.myBal);
		//ba1의 잔액 확인
		ba1.chkMyBal();
		//ba1의 입금
		ba1.depositMybal(3000);
		ba1.chkMyBal();
		//ba1의 출금
		ba1.withdraw(2000);
		ba1.chkMyBal();
		
		BankAccount ba2 = new BankAccount();
		ba2.chkMyBal();
		
	}

}
