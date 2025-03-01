package student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
		@Id
		@jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String firstname;
		private String lastname;
		private String email;
		private String address;
		
		public Student(long id, String firstname, String lastname, String email, String address) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.address = address;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String email() {
			return email;
		}

		public void getEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
					+ ", address=" + address + "]";
		}
		
		
		
		
}
