import java.util.Arrays;

class PersonClass implements Comparable{
	int age;
	String name;
	public PersonClass(int age, String string) {
		super();
		this.age = age;
		this.name = string;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PersonClass p = (PersonClass)o;
		return -(this.age - p.age); //역순
	}
	
}
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonClass[] p = new PersonClass[3];
		p[0] = new PersonClass(15,"홍길동");
		p[1] = new PersonClass(20,"김길동");
		p[2] = new PersonClass(25,"이길동");
		Arrays.sort(p);
		for(PersonClass i:p) {
			System.out.println("age: "+i.age+" name: "+i.name);
		}
	}

}
