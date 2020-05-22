import aa.bb.MyInterface;
class MyConstant{
	public static final String DBUrl = "192.168.0.198";
	public static final String DBUser = "hr";
	public static final String DBPass = "1234";
}
interface MyVari{
	String DBUrl = "192.168.0.198";
	String DBUser = "hr";
	String DBPass = "1234";
	
	/*
	 * interface에 변수에는 자동으로 public static final 이 들어가기 때문에
	 * 위에 클래스에 지정해놓은거랑 결과론적으로 같다
	 * 
	 */
}
public class Ex04 {
	Ex04(){
		System.out.println(MyInterface.AA);
		System.out.println(MyInterface.BB);
		
//		MyInterface.AA = 20; //final로 선언해서 값을 변경 할 수가 없다.
		
		MyInterface mf = new MyInterface() {
			@Override
			public void doMyInterface() { //public 선언 안했지만 자동으로 들어간다.
				System.out.println("테스트");	
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
