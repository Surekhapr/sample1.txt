package simple_maven;
import java.sql.*;

public class maven_pgm1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ details","root","root");
//	PreparedStatement p=c.prepareStatement("insert into india values(104,'druthi')");
//	PreparedStatement p1=c.prepareStatement("insert into india values(105,'chidu')");
//	PreparedStatement p2=c.prepareStatement("insert into india values(106,'muddu')");
	PreparedStatement p=c.prepareStatement("drop database details");
//PreparedStatement p;
int e=p.executeUpdate();
//while(e.next())
//{
//	e.next();
//
////p1.execute();
////p2.execute();
////p4.execute();
//	System.out.println(e.getInt(1));
//	System.out.println(e.getString(2));}
//	c.close();
	
	System.out.println("done");
//	System.out.println(e);
	}	}



//package demo1_package;
//import java.sql.*;
//
//
//
//public class pgm1 {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//		PreparedStatement p=c.prepareStatement("create database suri");
//		p.execute();
//		c.close();
//		System.out.println("database conncected");
//	}
//
//}
