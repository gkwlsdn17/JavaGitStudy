import java.util.Scanner;

class AccountBank{
	int myBal = 0;
	String name="";
	Scanner scan = new Scanner(System.in);
	public void deposit(int input) {
		myBal += input;
	}
	public void withdraw(int output) {
		myBal -= output;
	}
	public void checkMyBal() {
		System.out.println(name+"님의 잔액 = "+myBal);
	}
	public void setName() {
		System.out.println("고객님의 성함을 입력해주세요.");
		name=scan.nextLine();
		System.out.println("고객님의 성함은 "+name+"입니다.");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println("1.입금");
//		int select = scan.nextInt();
		AccountBank ab1 = new AccountBank();
//		if(select == 1) {
//			System.out.println("입금할 금액을 입력하세요");
//			ab1.deposit(scan.nextInt());
//		}
		ab1.checkMyBal();
		ab1.setName();
		ab1.deposit(3000);
		ab1.checkMyBal();
		ab1.withdraw(2000);
		ab1.checkMyBal();
		
		AccountBank ab2 = new AccountBank();
		ab2.checkMyBal();
	}

}
