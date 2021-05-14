
import java.sql.*;
	




public class inserting1 {


public static void main(String[] args)throws Exception {
	String url="jdbc:mysql://localhost:3306/home2home";
	String uname="root";
	String pass="";
	String query="insert into sagar values('illi','billi')";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	int count=st.executeUpdate(query);//DML(data manupulation Language)
	
	System.out.println(count+" rows affected");
	st.close();
	con.close();
	
}
} 