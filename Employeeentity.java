package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employeeentity {
	
	@Id
	@GeneratedValue
	private int id;
	private String employeename;
	private int employeeAge;
	private long salary;
	
	
	public Employeeentity(int id, String employeename, int employeeAge, long salary) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.employeeAge = employeeAge;
		this.salary = salary;
	}


	public Employeeentity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public int getEmployeeAge() {
		return employeeAge;
	}


	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
