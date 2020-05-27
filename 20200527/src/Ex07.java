import java.util.Arrays;

public class Ex07 {

	Ex07(){
		int a[] = {1,2,3,4,5};
		int b[] = Arrays.copyOf(a, a.length); //값복사
		int c[] = a; //참조복사
		for(int i:b) {
			System.out.println("bi = "+i);
		}
		for(int i:c) {
			System.out.println("ci = "+i);
		}
		a[0] = 5;
		
		for(int i:b) {
			System.out.println("bi = "+i);
		}
		for(int i:c) {
			System.out.println("ci = "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex07();
	}

}
