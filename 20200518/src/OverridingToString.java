class Cake{
	//ToString 메서드 오버라이딩
	@Override
	public String toString() {
		return "내 생일 케익";
	}
}
class CheeseCake extends Cake{

	@Override
	public String toString() {
		return "내 생일 치즈케익";
	}
	
}
public class OverridingToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
