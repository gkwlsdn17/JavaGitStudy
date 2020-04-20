import java.util.Scanner;
/* 
 * 명령프롬프트 창에서는
 * javac 명령어로 컴파일 함(javac Ex01.java)
 * 실행할때는 java Ex01.class
 * 이클립스 사용하기때문에 자동으로 컴파일이 되어서 저렇게 안해도 됨
 * 
 * debug 이클립스에서 사용하는 개발자 개발도구
 * f6 라인진행
 * f8 디버그 모드 종료 or 다음 브레이크 점까지 진행 f8
 */
public class Ex01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("입력하세요.");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		System.out.println("inputValue="+inputValue);
	}
}
