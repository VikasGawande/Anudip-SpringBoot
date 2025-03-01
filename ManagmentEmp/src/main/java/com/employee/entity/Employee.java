package com.employee.entity;

public class Employee {
		private Long id;
		private String name;
		private String dept;
		private String number;
		private String gender;
		private double salary;
		private String roll;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getRoll() {
			return roll;
		}
		public void setRoll(String roll) {
			this.roll = roll;
		}
		
		public Employee(Long id, String name, String dept, String number, String gender, double salary, String roll) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.number = number;
			this.gender = gender;
			this.salary = salary;
			this.roll = roll;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", number=" + number + ", gender=" + gender
					+ ", salary=" + salary + ", roll=" + roll + "]";
		}

}
