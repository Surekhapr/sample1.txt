
package practice_p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity


public class practice_pgm1 {
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String name;
	private long phno;
	private double sal;
	private int age;
	@Lob
	private byte[] image;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "practice_pgm1 [id=" + id + ", name=" + name + ", phno=" + phno + ", sal=" + sal + ", age=" + age + "]";
	}
	
	
	

}
