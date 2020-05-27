import java.util.Arrays;

public class Ex08 {
	Ex08(){
		int a[] = {1,2,3,4,5};
		int b[] = {0,0,0,0,0,0,0};
		
		System.arraycopy(a,1,b,2,3);
		
		for(int i:b) {
			System.out.println("i = "+i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08();
	}

}
