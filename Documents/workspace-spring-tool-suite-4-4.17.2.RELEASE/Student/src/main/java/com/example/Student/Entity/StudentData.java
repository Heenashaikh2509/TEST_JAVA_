package com.example.Student.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentData 
{

	@Id
	@Column
	private Long id;
	@Column
	private String First_name;
	@Column
	private String Last_name;
	@Column
	private String Email;
	@Column
	private int age;
	
	
	public StudentData(String first_name, String last_name, String email, int age) {
		super();
		First_name = first_name;
		Last_name = last_name;
		Email = email;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	
	
}
