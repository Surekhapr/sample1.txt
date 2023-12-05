package pgm1;

//package Sample;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class LuckyNumber {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String genratednumber;
	private String enteredNumber;
	private int score;
	@CreationTimestamp
	private Date date;
	// getters and setters

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

	public String getGenratednumber() {
		return genratednumber;
	}

	public void setGenratednumber(String genratednumber) {
		this.genratednumber = genratednumber;
	}

	public String getEnteredNumber() {
		return enteredNumber;
	}

	public void setEnteredNumber(String enteredNumber) {
		this.enteredNumber = enteredNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Random r = new Random();
		int[] arr1 = new int[3];
		for (int i = 0; i <= 2; i++) {
			arr1[i] = r.nextInt(10);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		int score = 0;
		System.out.println("All the best");
		int[] arr2 = new int[3];
		for (int i = 0; i <= 2; i++) {
			System.out.println("guess the number");
			arr2[i] = sc.nextInt();
			if (arr1[i] == arr2[i]) {
				score = score + 10;
				System.out.println("good");
			} else {
				System.out.println("oops wrong guess");
			}
		}
		System.out.println("Generated number-->" + Arrays.toString(arr1));
		System.out.println("Entered number-->" + Arrays.toString(arr2));
		System.out.println("ur total score is --->" + score);

		LuckyNumber l = new LuckyNumber();
		l.setName(name);
		l.setScore(score);
		l.setGenratednumber(Arrays.toString(arr1));
		l.setEnteredNumber(Arrays.toString(arr2));

		t.begin();
		m.persist(l);
		t.commit();

	}
}


