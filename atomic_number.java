import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class atomic_number {
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data_base","root","root");
//String s1="insert into abc11 "+"vales(1,'hydrogen','H')";
Statement st=con.createStatement();
boolean x=st.execute("insert into abc11 values(1,'hydrogen','H')");
if(x) {
	System.out.println("values inserted successfully");
}
else
	System.out.println("not success");
	}

}
