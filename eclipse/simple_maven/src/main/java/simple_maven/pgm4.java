package simple_maven;
import java.sql.*;

public class pgm4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");
		PreparedStatement p=c.prepareStatement("delete column id");
		//PreparedStatement p1=c.prepareStatement("insert into menu values(101,'sagu') ");
		int e =p.executeUpdate();
//		while(e.next()) {
//			System.out.println(e.getInt(1)+" "+e.getString(2));
//		}
		//p1.executeUpdate();
		c.close();
		System.out.println("done");
		System.out.println(e);
		
	}

}
