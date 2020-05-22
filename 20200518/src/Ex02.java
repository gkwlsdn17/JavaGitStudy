interface Printable{
	void doPrint(String doc);
}
class Print implements Printable{

	@Override
	public void doPrint(String doc) {
		// TODO Auto-generated method stub
		System.out.println(doc);
	}
	
}
public class Ex02{

	Ex02(){
		Print print = new Print();
		print.doPrint("안녕 인터페이스야");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}


}
