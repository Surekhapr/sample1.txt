package pgm1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class maindemo {

	public static void main(String[] args) {
		//Persistence persistence;
		EntityManagerFactory e =Persistence.createEntityManagerFactory("dev");
		EntityManager m =e.createEntityManager();
		EntityTransaction t =m.getTransaction();
		
		demo d =new demo();
		d.setAddress("mandya");
		d.setGender('f');
		d.setName("ambi");
		d.setPhno(989099l);
		
		t.begin();
		m.persist(d);
		t.commit();
		
		demo d1 =m.find(demo.class, 5)	;
		System.out.println(d1);
		
		demo d2 =m.find(demo.class, 2)	;
		t.begin();
		
		m.remove(d2);
		t.commit()
				;
		
		demo a=m.find(demo.class, 4)	;
		a.setAddress("kodgu");
		t.begin();
		m.merge(a);
		t.commit();
		
	}

}
