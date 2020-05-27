import java.util.Random;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		Random rand = new Random(System.currentTimeMillis());
		for(int i=0;i<10;i++) {
			int randNum = num1+rand.nextInt(num2-num1+1);
			System.out.println("랜덤숫자: "+randNum);
		}
		
		
	}

}
