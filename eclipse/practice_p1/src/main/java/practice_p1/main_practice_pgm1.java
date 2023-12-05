package practice_p1;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class main_practice_pgm1 {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		practice_pgm1 p=new practice_pgm1();
		p.setName("chidu");
		p.setAge(5);
		p.setPhno(2225l);
		p.setSal(4500002);
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\New folder (2)\\siidu.jpg");
		byte[] arr=new byte[fis.available()];
		fis.read(arr);
		            p.setImage(arr);
		            
//		            FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Downloads\\chidu.pem");
//		    		byte[] arr=new byte[fis.available()];
//		    		fis.read(arr);
//		    		
//		    		d.setImagee(arr);
		
		t.begin();
		m.persist(p);
		t.commit();
//		practice_pgm1 p1=m.find(practice_pgm1.class, 4);
//		System.out.println(p1);
		

//		Student s = e.find(Student.class, 5);
//		System.out.println(s);
		
//		Student a = e.find(Student.class, 2);
//		a.setAddress("tumkur");
//		t.begin();
//		e.merge(a);
//		t.commit();
//		practice_pgm1  p2=m.find(practice_pgm1.class,1);
//		p1.setName("surideveloper");
//		t.begin();
//		m.merge(p2);
//		t.commit();
//		
//		practice_pgm1  p21=m.find(practice_pgm1.class,1);
//		t.begin();
//		m.remove(p21);
//		t.commit();
		
		
		
		
		

	}

}
