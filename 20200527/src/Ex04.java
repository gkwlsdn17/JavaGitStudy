import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random(System.currentTimeMillis());
		for(int i=0;i<10;i++) {
			System.out.println(rand.nextInt(100));
		}
	}

}
