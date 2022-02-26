package com.mutasa.FirstProject.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String full_name;
	private String email;
	private Date dob;
	private int age;
	
	public Student() {
		
	}
	
	public Student(Integer id, String full_name, String email, Date dob) {
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.dob = dob;
		this.age = LocalDate.now().getYear() - Integer.parseInt(dob.toString().split("-")[0]);
	}
	
	public Student(String full_name, String email, Date dob) {
		this.full_name = full_name;
		this.email = email;
		this.dob = dob;
		this.age = LocalDate.now().getYear() - Integer.parseInt(dob.toString().split("-")[0]);
	}

	public Integer getId() {
		return id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}
	
	public String getStringDob() {
		return this.dob.toString();
	}

	public void setDob(Date dob) {
		this.dob = dob;
		this.age = LocalDate.now().getYear() - Integer.parseInt(dob.toString().split("-")[0]);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(Date dob) {
		this.dob = dob;
		this.age = LocalDate.now().getYear() - Integer.parseInt(dob.toString().split("-")[0]);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", full_name=" + full_name + ", email=" + email + ", dob=" + dob.toString() + ", age=" + age
				+ "]";
	}
}
