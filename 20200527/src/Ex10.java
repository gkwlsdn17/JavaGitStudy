class B{
	private int num;

	public B(int num) {
		super();
		this.num = num;
	}
	
	public boolean myEquals(B b) {
		if(this.num == b.num) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(this.num == ((B)obj).num) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

public class Ex10 {

	Ex10(){
		B b1 = new B(10);
		B b2 = new B(10);
		
		System.out.println("b1.equals(b2) = "+b1.equals(b2));
		System.out.println(b1.myEquals(b2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex10();
	}

}
