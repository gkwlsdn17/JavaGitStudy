import java.util.Scanner;

class MyException extends Exception{
	public MyException() {
		super("점심은 고기로");
	}
	
}
public class Ex04 {

	public static void main(String[] args) /*throws MyException*/ {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("점심 뭐 먹을래");
			String menu = sc.nextLine();
			if(menu.contains("고기")) {
				System.out.println("정상입니다");
			}
			else {
				throw new MyException();
			}
		}catch (MyException e) {
			System.out.println("아냐 고기 먹어");
		}
		
	}

}
