class Box<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
	
	
}
public class Ex07 {

	public static <T> Box<T> makeBox(T o){ //제네릭 함수는 static 써줘야함
		Box<T> box = new Box<T>();
		box.setT(o);
		return box;
		
		}
	Ex07(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> bx1 = Ex07.<String>makeBox("test");
		System.out.println(bx1);
		new Ex07();
	}

}
