
public class Ex01 {

	public static void main(String[] args) {
		//2,4,6,8단 출력(단, 2단은 2까지 곱, 4단은 4까지 곱 , ...)
		for(int i=2;i<9;i=i+2) {
			for(int j=1;j<i+1;j++) {
				System.out.println(i +" * "+ j +" = "+ (i*j));
			}
			System.out.println();
		}
	}
}
