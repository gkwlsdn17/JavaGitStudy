class A{
	public void doA() {
		System.out.println("A.doA");
	}
}
class B extends A{
	public void doA() {
		System.out.println("B.doA"); //Override
		
		super.doA(); //상위 클래스 참조해서 doA를 실행하니까 A클래스의 doA가 출력된다.
	}
}
public class Ex03 {

	Ex03(){
		B b = new B();
		b.doA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

}
