import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		int sum = 0;
		try {
			sc = new Scanner(new File("D:\\a.txt"));
//			String a = sc.next();
//			System.out.println("a = "+a);
//			String b = sc.next();
//			System.out.println("b = "+b);
			String temp = null;
			while((temp = sc.next())!=null) {
				System.out.println("temp = "+temp);
				try {
					int intval = Integer.parseInt(temp);
					System.out.println("temp = "+temp);
					System.out.println("숫자는 형변환 가능");
					sum += intval;
				}catch(Exception e) {
					System.out.println("temp = "+temp);
					System.out.println("aaa bbb ccc는 형변환 실패");
				}
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("sum = "+sum);
		System.out.println("정상종료");
		sc.close();
	}

}
