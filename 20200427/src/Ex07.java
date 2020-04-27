class Person{
	String name="";
	
	void doStudy() {
		System.out.println(name+"씨가 공부하고 있어요.");
	}
	
	void setName(String input) {
		name=input;
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.doStudy();
		
		Person p2 = p1;
		p2.setName("김길동");
		p2.doStudy();
		
		p1.doStudy();
	}
}
