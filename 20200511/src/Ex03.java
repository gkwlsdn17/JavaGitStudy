
public class Ex03 {

	Ex03(){
		String a = "MyStringa";
		String b = "MyStringb";
		
		System.out.println("a.charAt(0) = "+a.charAt(0));
		System.out.println("a.charAt(1) = "+a.charAt(1));
		
		System.out.println(a == "MyStringa"); // 이렇게 사용하지 말것.
		System.out.println(a.equals("MyStringa")); //문자열 비교는 equals함수 사용 할 것.
		
		String split_ = "a,b,c,d,e";
		String[] split = split_.split(",");
		for(String temp : split) {
			System.out.println("temp = "+ temp);
		}
		System.out.println();
		
		System.out.println(a);
		System.out.println(a.length());
		System.out.println();
		
		System.out.println(b);
		System.out.println(b.length());
		System.out.println();
		
		showString("MyStringc");
	}
	public void showString(String c) {
		System.out.println(c);
		System.out.println(c.length());
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
