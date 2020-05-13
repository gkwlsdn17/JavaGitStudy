
class GiaCar extends Car{

	public void tellInfo() {
		System.out.println("기아");
		tellName();
	}
}
class SsangyongCar extends Car{
	
	public void tellInfo() {
		System.out.println("쌍용");
		tellName();
	}
}
class SamsungCar extends Car{
	
	public void tellInfo() {
		System.out.println("삼성");
		tellName();
	}
}
public class Car {

	String name;
	/*
	 * 기본 생성자가 있어야 상속받은 곳에서 에러가 안난다.
	 * 상속 받은 클래스에서는 부모 생성자가 자동으로 생성이 되는데, 이것을 보여주지 않을 뿐이다.
	 * 그래서 자동완성으로 만들어보면은 super()라는 구문이 들어가게 되는데, 이게 부모 생성자를 자동으로 호출한다는 의미이다.
	 * 
	 * 아무튼 그래서 Car라는 클래스에서 public Car(String name){} 구문만 만들어놓으면, GiaCar 클래스에서는 에러가 나고,
	 * 에러 처리하려고 빨간줄 눌러서 보면은 GiaCar(String name){super(name)}이라는 구문이 자동으로 생성되고,
	 * 그 이유는 부모 클래스에서 생성자를 그렇게 만들어 놨기 때문에 부모 생성자를 반드시 호출하게 되어있는 자식 클래스에서는 반드시 그 구문을 만들어 줘야하기 때문이다.
	 * 그래서 부모 생성자에서 아무것도 매개변수 안 준 Car()라는 구문을 하나 만들어 놓으면, 자식 클래스에서는 자동으로 super()라는 구문이 만들어져서 아무것도 안만들어도 에러가 안난다.
	 * */
	Car(){
		
	}
	public Car(String name) {
		
		this.name = name;
	}
	public void tellName() {
		System.out.println("name = "+name);
	}
}
