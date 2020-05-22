import javax.swing.JOptionPane;

class A{
	private int a = 10;
}
class B extends A{
	private int b = 20;
}
public class Ex07 {

	Ex07(){
		try {
			int[] arr = {1,2,3};
			
			for(int i=0;i<4;i++) {
				System.out.println(arr[i]); //ArrayIndexOutOfBoundsException
			}
			
			A a = new A();
			B b = (B)a; //ClassCastException
			
			String c = null;
			System.out.println(c.length()); //NullPointerException
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어남");
		}catch (ClassCastException e) {
			System.out.println("class cast 오류");
		}catch (NullPointerException e) {
			System.out.println("nullpointer참조");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("정상 종료");
		
		String test = JOptionPane.showInputDialog("입력하세요");
		System.out.println("test = "+test);
		
		int bb=0;
		try {
			if((bb = Integer.parseInt(test))==1) {
				System.out.println("1을 입력했음");
			}	
		}
		catch (Exception e) {
			System.out.println("만약에 문자 입력하면 b는 무조건 0");
			bb = 0;
			System.out.println(bb);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex07();
	}

}
