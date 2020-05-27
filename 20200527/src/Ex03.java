import java.math.BigDecimal;
class MyRapA{
	int a = 10;
	
	public MyRapA(int a) {
		super();
		this.a = a;
	}

	//비파괴적 함수
	public int doAdd(int b) {
		return this.a+b;
	}
	//파괴적 함수
	public void doAdd1(int b) {
		this.a = this.a + b;
	}
}
public class Ex03 {

	Ex03(){
		MyRapA mra = new MyRapA(10);
		
		System.out.println("mra.doAdd(10) = "+mra.doAdd(10));
		System.out.println("mra = "+mra.a);
		
		mra.a = mra.doAdd(10);
		System.out.println("mra = "+mra.a);
		
		mra.doAdd1(10);
		System.out.println("mra = "+mra.a);
		
		
		double a = 0.1;
		for(int i=0;i<10;i++) {
			a += 0.1;
		}
		System.out.println("a = "+a);
		
		BigDecimal bd = new BigDecimal(0.1);
		for(int i=0;i<10;i++) {
			bd = bd.add(new BigDecimal(0.1));
		}
		System.out.println("bd = "+bd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

}
