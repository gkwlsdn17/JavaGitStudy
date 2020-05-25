/*
 * throws Exception은 예외를 넘기는것.
 * main에서 throws Exception으로 예외를 넘기면 시스템이 알아서 처리한다(종료시켜버린다)
 */
public class Ex03 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		doA();
		System.out.println("정상종료");
	}
	public static void doA() throws Exception{
//		try {
			doB();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public static void doB() throws Exception {
		//RuntimeException - 실행하는 중간에 발생하는 예외
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		//소스 상에 Exception 빨간줄이 나오기 때문에 예외를 무조건 잡아줘야 한다.
		throw new Exception("내가만든예외");
	}

}
