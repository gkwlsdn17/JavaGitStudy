interface A{
	public void doA();
}
interface B{
	public void doB();
}
public class Ex01 implements A,B{

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		System.out.println("doA 함수 입니다.");
	}
	@Override
	public void doB() {
		// TODO Auto-generated method stub
		System.out.println("doB 함수 입니다.");
	}
	Ex01(){
		doA();
		doB();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
		System.out.println();
		Ex01 ex01 = new Ex01();
		ex01.doA();
	}

	
}
