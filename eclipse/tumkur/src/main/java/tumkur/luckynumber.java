package tumkur;
	import java.util.Date;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;

	import org.hibernate.annotations.CreationTimestamp;

	@Entity
	public class luckynumber {
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


