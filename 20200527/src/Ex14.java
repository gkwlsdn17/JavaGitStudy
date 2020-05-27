import java.util.Arrays;

class Person2 implements Comparable{
	int age;
	String name;
	
	public Person2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person2 p = (Person2)o;
		
		return this.name.length() - p.name.length();
	}
}
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2[] p = new Person2[3];
		
		p[0] = new Person2(15,"홍길동");
		p[1] = new Person2(20,"김김길ㄱ;ㄹ길동");
		p[2] = new Person2(25,"이이이길동");
		Arrays.sort(p);
		for(Person2 i:p) {
			System.out.println("age: "+i.age+" name: "+i.name);
		}

	}

}
