package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class EmployeeBean {

	@Id
	@GeneratedValue
	private int eId;

	@Column(name = "employeeName")
	private String eName;

	private int eAge;

	@Size(min = 30)
	@Column(unique = true)
	private String eEmail;

	@Column(nullable = false)
	private double salary;
	
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

}
