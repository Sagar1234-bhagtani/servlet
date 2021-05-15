
import java.sql.*;
	




public class inserting2dinamically {


public static void main(String[] args)throws Exception {
	String url="jdbc:mysql://localhost:3306/home2home";
	String uname="root";
	String pass="";
	String userid="Mohini";
	String username="rohini";
	String query="insert into sagar values(?,?)";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	//Statement st=con.createStatement();
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1, userid);
	st.setString(2,username);
	int count=st.executeUpdate();//DML(data manupulation Language)
	
	System.out.println(count+" rows affected");
	st.close();
	con.close();
	
}
} 