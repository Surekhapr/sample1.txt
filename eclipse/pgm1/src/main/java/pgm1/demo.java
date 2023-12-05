package pgm1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class demo {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private char gender;
	private long phno;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", phno=" + phno
				+ "]";
	}
	
			

}
