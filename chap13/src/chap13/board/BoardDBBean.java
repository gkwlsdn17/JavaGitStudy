package chap13.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDBBean {

	private static BoardDBBean instance = new BoardDBBean();
	public static BoardDBBean getInstance() {
		return instance;
	}
	
	public String doA() {
		return "연결";
	}
	
	public void insertArticle(BoardDataBean dataBean) {
		Connection conn = null; //DB 연결
		PreparedStatement pstmt = null; //select,insert,update,delete
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//class파일이 해당 경로에 있는지 찾는다
			//mysql은 3306포트, oracle은 1521, sqlserver는 1433포트 사용
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;databasename=khk_20200611", "sa", "8765432!");
			pstmt = conn.prepareStatement("INSERT INTO [dbo].[board]\r\n" + 
					"           ([num]\r\n" + 
					"           ,[writer]\r\n" + 
					"           ,[email]\r\n" + 
					"           ,[subject]\r\n" + 
					"           ,[passwd]\r\n" + 
					"           ,[reg_date]\r\n" + 
					"           ,[readcount]\r\n" + 
					"           ,[ref]\r\n" + 
					"           ,[re_step]\r\n" + 
					"           ,[re_level]\r\n" + 
					"           ,[content]\r\n" + 
					"           ,[ip])\r\n" + 
					"     VALUES\r\n" + 
					"           ((select max(num)+1 as num from board)\r\n" + 
					"           , ? \r\n" + 
					"           , ? \r\n" + 
					"           , ? \r\n" + 
					"           , ? \r\n" + 
					"           ,getdate()\r\n" + 
					"           ,0\r\n" + 
					"           ,0\r\n" + 
					"           ,0\r\n" + 
					"           ,0\r\n" + 
					"           , ? \r\n" + 
					"           ,'192.168.0.198')");
			pstmt.setString(1, dataBean.getWriter());
			pstmt.setString(2, dataBean.getEmail());
			pstmt.setString(3, dataBean.getSubject());
			pstmt.setString(4, dataBean.getPasswd());
			pstmt.setString(5, dataBean.getContent());
			pstmt.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertDetailArticle(String name, String subject, String email, String content, String passwd) {
		
	}
}
