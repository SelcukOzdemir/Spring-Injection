package com.sso.injection.setter;

public class Employee {

	private String firstname;
	private String surname;
	private int salary;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", surname=" + surname
				+ ", salary=" + salary + "]";
	}
}
