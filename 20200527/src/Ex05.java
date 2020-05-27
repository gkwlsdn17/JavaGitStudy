import java.util.StringTokenizer;

public class Ex05 {
	Ex05(){
		StringTokenizer st1 = new StringTokenizer("AM:10:49",":");
		while(st1.hasMoreElements()) {
			String a = st1.nextToken();
			System.out.println(a);
		}
		StringTokenizer st2 = new StringTokenizer("3+5-9/30=10","+-/=");
		while(st2.hasMoreElements()) {
			String a = st2.nextToken();
			System.out.print(a+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

}
