
public class Ex08 {

	Ex08(){
		int[] temp1 = new int[10]; //[]이 앞에 있어도 되고 뒤에 있어도 됨
		int temp2[] = new int[10];
		
		System.out.println("temp1.length "+temp1.length);
		System.out.println("temp2.length "+temp2.length);
		
		temp1[0]=10;
		for(int i=0;i<10;i++) {
			System.out.println("temp1 ["+i+"]= "+temp1[i]);
		}
		
		String a[] = new String[10];
		for(int i=0;i<10;i++) {
			System.out.println("a ["+i+"]= "+a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex08();
	}

}
