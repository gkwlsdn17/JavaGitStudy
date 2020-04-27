class A{
	int a = 10;
	int b = 20;
	
	public void doA() {
		System.out.println("doA메서드입니다.");
	}
	public void doB() {
		System.out.println("doB메서드입니다.");
	}
}
public class Ex04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.doA();
		a.doB();
		System.out.println("a.a="+a.a);
		System.out.println("a.b="+a.b);
		
	}

}
