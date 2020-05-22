interface Phone{
	public void call();
}
class SPhone implements Phone{
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전화기로 전화");
	}
}
class LPhone implements Phone{
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("LG 전화기로 전화");
	}
}
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new SPhone();
		p1.call();
		Phone p2 = new LPhone();
		p2.call();
	}

}
