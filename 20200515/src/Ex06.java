class Person{
	protected String name;

	public Person(String name) {
		this.name = name;
	}
}
class StuFriend extends Person{

	public void doStudy() {
		System.out.println(name + "는 공부를 함");
	}
	public StuFriend(String name) {
		super(name);
	}
	
}
class ComFriend extends Person{
	public void doWork() {
		System.out.println(name+"는 일을 함");
	}
	public ComFriend(String name) {
		super(name);
	}
	
}
public class Ex06 {
	Ex06(){
		
//		StuFriend[] stufs = new StuFriend[10];
//		ComFriend[] comfs = new ComFriend[10];
		
		Person[] persons = new Person[20];
		persons[0] = new StuFriend("김길동");
		persons[1] = new ComFriend("홍길동");
		
		if(persons[0] instanceof StuFriend) {
			StuFriend temp = (StuFriend)persons[0];
			temp.doStudy();
		}
		if(persons[1] instanceof ComFriend) {
			ComFriend temp = (ComFriend)persons[1];
			temp.doWork();
		}
		/*
		 * Ex05에서는 AAA 를 CCC로 형변환 하는게 안됐었는데 ( AAA = new AAA()로 만든 후 CCC로 형변환 시도),
		 * 여기서는 AAA를 new CCC();로 만들어서 형변환을 하기 때문에 가능하다.
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
