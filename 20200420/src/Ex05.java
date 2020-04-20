import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("스위치 공부");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		//ctrl + shift + f 자동정렬
		switch(input) {
		case 1:
			System.out.println("1 입력했네요");
			break;
		case 2:
			System.out.println("2 입력했네요");
			break;
		default:
			System.out.println("다른거 입력했네요");
			break;
		}
	}
}
