
import java.sql.*;
	




public class firstbasic {


public static void main(String[] args)throws Exception {
	String url="jdbc:mysql://localhost:3306/home2home";
	String uname="root";
	String pass="";
	String query="select email from sagar where name='domo'";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String name=rs.getString("email");
	System.out.println(name);
	st.close();
	con.close();
	
}
} 