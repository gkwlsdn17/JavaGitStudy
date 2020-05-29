class Apple{

	@Override
	public String toString() {
		return "Apple";
	}
	
}
class Orange{

	@Override
	public String toString() {
		return "Orange";
	}
	
}
class FruitBox<T>{ //제네릭
	
	/*
	 * 제네릭을 사용하면 형변환을 하지 않아도 T에 해당하는 자료형을 반환 할 수 있다.
	 * 만약 Ex02처럼 Object로 사용하면 반환 할 때 자료 형 변환을 해야하는데,
	 * 이렇게 쓰면 언젠가 문제가 생길 수 있다.
	 * (Apple)FruitBox.get() 이나 (Orange)FruitBox.get() 이렇게 사용하는것이 아니고 그냥
	 * FruitBox.get()하면 Apple, Orange에 맞게 형변환 해서 자동으로 나온다는 얘기다.
	 */
	
	T object;

	public FruitBox(T object) {
		super();
		this.object = object;
	}

	@Override
	public String toString() {
		return "AppleBox [name=" + object + "]";
	}
	
	
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox<Apple> fb1 = new FruitBox<Apple>(new Apple());
		System.out.println(fb1);
		FruitBox<Orange> fb2 = new FruitBox<Orange>(new Orange());
		System.out.println(fb2);
	}

}
