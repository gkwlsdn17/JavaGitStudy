
public class Ex06 {

	Ex06(){
		int[] a = {1,2,3,4,5};
		int[] b = a;
		
		for(int i:a) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		for(int i:b) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		a[0] = 10;
		for(int i:a) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		for(int i:b) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
