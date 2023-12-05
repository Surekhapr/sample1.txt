package controller;
import dto.student;
import dao.studentDao;

public class mycontroller {

	public static void main(String[] args) {
		studentDao s=new studentDao();
		student s=new student();
		s.setName("sridhar");
		s.setAddress("banagalore");
		dao.addstudent(s);
		dao.fetchstudent(2);
		dao.updatestudent(2,"ramesh");
		dao.deletestudent(2);
		
	}

}
