
import java.sql.*;
	




public class Exampleforprintingtable {


public static void main(String[] args)throws Exception {
	String url="jdbc:mysql://localhost:3306/home2home";
	String uname="root";
	String pass="";
	String query="select * from signup";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	while(rs.next()) {
	String name=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
	System.out.println(name);
	}
	st.close();
	con.close();
	
}
} 