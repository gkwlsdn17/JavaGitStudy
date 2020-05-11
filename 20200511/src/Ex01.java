/*
 * 다음 main 메서드와 함께 동작하는 Accumulator 클래스를 정의하자
 * 그리고 accumulator 클래스에 main 메소드도 넣어서 컴파일 및 실행을 하자
 * 
 * 실행 결과로 즉 showResult 메소드의 호출 결과로 다음과 같은 수준의 출력을 보이면 된다
 * sum = 45
 */
class Accumulator{

	public static int result = 0;
	
	public static void add(int i) {
		// TODO Auto-generated method stub
		result += i;
	}

	public static void showResult() {
		// TODO Auto-generated method stub
		System.out.println("result = "+result);
	}
	
}
public class Ex01 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Accumulator.add(i);
			/*
			 * 클래스를 따로 정의해주지않아도 돌아가는 이유는, static을 붙였기 때문이다.
			 * 메모리상에 미리 올라가져 있기 때문에 Accumulator ac = new Accumulator()이런식으로 정의하지 않아도
			 * Accumulator.add(i)가 작동이 된다.
			 * 즉, static을 붙이면 메모리상에 미리 적재된다!!
			 */
		}
		Accumulator.showResult();
	}
}
