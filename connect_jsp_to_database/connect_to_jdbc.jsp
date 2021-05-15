<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
String url="jdbc:mysql://localhost:3306/home2home";//add connector file in library.
String username="root";
String pass="";
String query="select * from sagar where name='illi'";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,pass);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
rs.next();



%>
Name:<%=rs.getString(1) %><br>
Email:<%=rs.getString(2) %><br>
</body>
</html>