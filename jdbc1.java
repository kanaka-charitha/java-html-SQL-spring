 package jdbc_practice;
import java.sql.*;
public class jdbc1 {

	public static void main(String[] args)throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data_base","root","root");
		System.out.println("connected");
		
		ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1,100);
		ps.setFloat(2,30000);
		ps.setString(3,"kanaka");
		ps.setInt(4,1);

	ps.executeUpdate();
		
		
		//ResultSet rs=ps.executeQuery();
		
		//while(rs.next()) {
			//System.out.println(rs.getInt("eno"));
			//System.out.println(rs.getString("ename"));
			//System.out.println(rs.getFloat("esal"));
			
		//}
	}
	catch(SQLException |ClassNotFoundException se){
	System.out.println(se);
	
}
	finally {
		con.setAutoCommit(false);
		con.commit();
	}
	}
	
	}


