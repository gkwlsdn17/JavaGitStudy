
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1번");
		for(int i=2;i<9;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +"*" +j +"= "+(i*j)+"  ");
			}
			System.out.println();
		}
		
		System.out.println("문제 2번");
		int A,B = 0;
		for(A=0;A<10;A++) {
			for(B=0;B<10;B++) {
				if((A*10+B)+(B*10+A)==99) {
					System.out.println("A = "+A +","+"B = "+B+" AB = "+(A*10+B)+","+"BA = "+(B*10+A));
				}
			}
		}
	}

}
