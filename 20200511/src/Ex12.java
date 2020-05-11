class House{
	private String name;

	public House(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "House [name=" + name + "]";
	}
	
}
public class Ex12 {

	Ex12(){
		House house[] = new House[3];
		house[0]=new House("삼");
		house[1]=new House("성");
		house[2]=new House("맨");
		for(House temp:house) {
			System.out.println("temp = "+temp);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex12();
	}

}
