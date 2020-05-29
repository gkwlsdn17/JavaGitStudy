<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.PreparedStatement" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ex01.jsp">
	aa:<input type="text" name="aa">
	bb:<input type="text" name="bb">
	<input type="submit" value = "insert하기"/>
</form>

<%
	String a = request.getParameter("aa"); //input태그 "aa"에 있는 값을 가져와서 a에 담는다
	String b = request.getParameter("bb"); //input태그 "bb"에 있는 값을 가져와서 b에 담는다
	
	int aaa = 10;
	out.print("aaa = "+aaa);
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		//oracle폴더안에 jdbc폴더안에 driver폴더 안에 OracleDriver파일이 있는지 확인
		//(ojdbc.jar파일을 압축 풀어보면 이런 폴더가 있는것을 확인할수있음)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
		//pstmt = conn.prepareStatement("insert into a values ('"+a+"','"+b+"')");
		pstmt = conn.prepareStatement("insert into a values (?,?)");
		pstmt.setString(1,a);
		pstmt.setString(2,b);
		pstmt.executeUpdate();
		
		
		
	}catch(Exception e){
		
	}
%>
</body>
</html>