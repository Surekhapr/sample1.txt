package tumkur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass1 {

	public static void main(String[] args) {
		//student s=new student();
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager e=f.createEntityManager();
		EntityTransaction t=e.getTransaction();
		
		student s=new student();
		s.setNumber(872252161l);
		s.setAddress("ballapra");
		s.setName("atte");
		//s.setId(11);
		
		t.begin();
		e.persist(s);
		t.commit();
		
		student s1=e.find(student.class, 2);
				System.out.println(s);
				
				student s12=e.find(student.class, 1);
				t.begin();
				e.remove(s);
				t.commit();
				
			student a=	e.find(student.class, 2);
			a.setAddress("tumku");
			t.begin();
			e.merge(a);
			t.commit();
			

				

		
		
	}

}
