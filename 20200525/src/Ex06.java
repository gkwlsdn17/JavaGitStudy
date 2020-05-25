import java.sql.Connection; //연결 유지 객체
import java.sql.DriverManager;
import java.sql.PreparedStatement; //sql 담는 객체
import java.util.Scanner;

public class Ex06 {
	Ex06(){
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값: ");
		String a = sc.nextLine();
		System.out.println("b의 값: ");
		String b = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
//			pstmt = conn.prepareStatement("insert into a(aa,bb) values ('aa','bb')");
			pstmt = conn.prepareStatement("insert into a(aa,bb) values ('"+a+"','"+b+"')");
			
			//insert, update, delete는 executeUpdate로 실행
			//select는  executeQuery로 실행
			pstmt.executeUpdate();
			

			System.out.println("정상적으로 DB 연결 성공");
			
		}catch (Exception e) {
			// 예외 발생 했을 때 처리하는 영역
			e.printStackTrace();
		}finally {
			//예외가 발생하든 함수가 종료되든 무조건 실행하는 영역
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch (Exception e) {

			}
			
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
