class AAA{
	public void doA() {
		System.out.println("AAA.doA()메서드");
	}
}
class BBB extends AAA{
	public void doB() {
		System.out.println("BBB.doB()메서드");
	}
}
class CCC extends BBB{
	public void doC() {
		System.out.println("CCC.doC()메서드");
	}
}
/*
 * new CCC 생성하면 doA doB doC 함수 호출이 가능하다.
 * new BBB 생성하면 doB doA 함수 호출이 가능하다.
 * new AAA 생성하면 doA 함수 호출이 가능하다.
 * 
 * 모든 자식 클래스는 부모 클래스 형태에 담을 수 있다.
 * 부모클래스 형태를 기반으로 호출 할 수 있는 함수가 정해진다.
 * 
 * 부모클래스는 자식 클래스에 형태에 담을 수 없다.(하지만, 형변환을 통해서 담는다)
 */
public class Ex05 {
	Ex05(){
		CCC ccc = new CCC();
		ccc.doA();
		
		//부모클래스 형태로 모든 자식 클래스 가능
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		AAA a3 = new CCC();
		//근데 doB doC 함수가 사용이 안되네
		
		
		//부모클래스는 자식 클래스 형태에 담을 수 없다.
//		CCC c1 = new AAA();
		//하지만, 강제 형변환 하면 가능하다.
//		CCC c1 = (CCC) new AAA();
//		c1.doB(); 
		//는 사실 안된다. 변환이 안되네.
		
		AAA a4 = new AAA();
		if(a4 instanceof CCC) {
			System.out.println("바꿀 수 있다.");
		}
		else {
			System.out.println("바꿀 수 없다.");
		}
		CCC cc = new CCC();
		if(cc instanceof AAA) {
			System.out.println("바꿀 수 있다.");
		}
		else {
			System.out.println("바꿀 수 없다.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

}
