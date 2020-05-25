import java.sql.Connection; //연결 유지 객체
import java.sql.DriverManager;
import java.sql.PreparedStatement; //sql 담는 객체
import java.sql.ResultSet; //table 내용 담는 객체

public class Ex05 {
	Ex05(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//예외가 나오는지 관찰하는 영역
			
			//OracleDriver라는 class파일 찾아서 있으면 예외 발생 안함
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareStatement("select * from a");
			rs = pstmt.executeQuery();
			
//			rs.next();
//			System.out.println("11111 rs.getString(1) = "+rs.getString(1));
//			System.out.println("11111 rs.getString(2) = "+rs.getString(2));
//			
//			rs.next();
//			System.out.println("22222 rs.getString(1) = "+rs.getString(1));
//			System.out.println("22222 rs.getString(2) = "+rs.getString(2));
//			
			while(rs.next()) {
				System.out.println("rs.getString(1) = "+rs.getString(1));
				System.out.println("rs.getString(2) = "+rs.getString(2));
			}
			
			
			System.out.println("정상적으로 DB 연결 성공");
			
		}catch (Exception e) {
			// 예외 발생 했을 때 처리하는 영역
			e.printStackTrace();
		}finally {
			//예외가 발생하든 함수가 종료되든 무조건 실행하는 영역
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch (Exception e) {

			}
			
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
