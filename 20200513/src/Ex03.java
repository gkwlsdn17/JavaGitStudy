class A{
	A(){
		System.out.println("A클래스생성자");
	}
}
class B extends A{
	B(){
		System.out.println("B클래스 생성자");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}
