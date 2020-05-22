import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	Ex06(){
		try {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("첫번째 수 입력");
			int a = scan.nextInt();
			
			System.out.println("두번째 수 입력");
			int b = scan.nextInt();
			
			System.out.println("a/b = "+a/b);
			System.out.println("예외상황에서는 이 줄을 실행하지 않는다.");
			
			scan.close();
			
		}catch (ArithmeticException ae) {
			System.out.println("예외상황");
			ae.printStackTrace();
		}catch (InputMismatchException ie) {
			System.out.println("문자열 예외");
			ie.printStackTrace();
		}
		System.out.println("종료됩니다.");
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
