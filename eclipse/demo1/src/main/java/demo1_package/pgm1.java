package demo1_package;
import java.sql.*;



public class pgm1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement p=c.prepareStatement("create database suri");
		p.execute();
		c.close();
		System.out.println("database conncected");
	}

}
