import java.util.Arrays;

class Person implements Comparable{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object arg0) {
		Person p = (Person)arg0;
//		if(this.age>p.age) {
//			return 1;
//		}
//		else if(this.age < p.age) {
//			return -1;
//		}
//		else {
//			return 0;	
//		}
		
		return this.age-p.age; //this.age가 더 크면 양수, 작으면 음수, 같으면 0
		
	}
	
}
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] ar = new Person[3];
		ar[0] = new Person(20,"홍길동");
		ar[1] = new Person(10,"김길동");
		ar[2] = new Person(30,"이길동");
		
		Arrays.sort(ar);
//		for(int i=0;i<ar.length;i++) {
//			System.out.println("ar["+i+"].age="+ar[i].age);
//			System.out.println("ar["+i+"].name="+ar[i].name);
//		}
		for(Person p:ar) {
			System.out.println("age="+p.age);
			System.out.println("name="+p.name);
		}
	}

}
