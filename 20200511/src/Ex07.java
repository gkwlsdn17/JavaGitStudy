import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File("src/a.txt");
		try {
			Scanner sc = new Scanner(file);
			int num1 = sc.nextInt();
			System.out.println(num1);
			num1 = sc.nextInt();
			System.out.println(num1);
			num1 = sc.nextInt();
			System.out.println(num1);
			num1 = sc.nextInt();
			System.out.println(num1);
			
			String s1 = sc.next(); //nextLine말고 next써야 다음라인이 나옴
			System.out.println(s1);
			
			String s2 = sc.next();
			System.out.println(s2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
