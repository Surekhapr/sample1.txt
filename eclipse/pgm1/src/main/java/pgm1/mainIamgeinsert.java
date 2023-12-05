package pgm1;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Persistence;

@Entity
class details{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String name;
	private double income;
	
	@Lob
	private byte[] imagee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public byte[] getImagee() {
		return imagee;
	}
	public void setImagee(byte[] imagee) {
		this.imagee = imagee;
	}
		
	
}


public class mainIamgeinsert {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		details d=new details();
		d.setName("surekha");
		d.setIncome(98876.99877);
		
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Downloads\\chidu.pem");
		byte[] arr=new byte[fis.available()];
		fis.read(arr);
		
		d.setImagee(arr);
		
		t.begin();
		m.persist(d);
		t.commit();
		
		
		
	}

}
