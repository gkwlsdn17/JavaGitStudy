import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[10];
		Arrays.fill(a, 3);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println();
		
		int[] b = new int[10];
		Arrays.fill(b, 0, 3, 3);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
	}

}
