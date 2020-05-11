
public class Ex04 {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "abcd";
		
		String c = new String("abcd");
		String d = new String("abcd");
		
		if(a==b) {
			System.out.println("a==b 같은 메모리 주소를 참조 하고 있다.");
		}
		else {
			System.out.println("a==b 다른 메모리 주소를 참조 하고 있다.");
		}
		
		if(c==d) {
			System.out.println("c==d 같은 메모리 주소를 참조 하고 있다.");
		}
		else {
			System.out.println("c==d 다른 메모리 주소를 참조 하고 있다.");
		}
		
	}
}
