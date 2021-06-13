package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="user")
@Table(name="users")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class user implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	@Column
	private String fname;
	@Column
	private String lname;
	
	@Column
	private String email;
	
	@Column
	@JsonProperty("phone")
	private String phone;
	
	@Column
	private String password;
	@Column
	private double age;
	@Column
	private double Gross_salary;
	@Column
	private double Income_Tax;
	@Column
	private double Professional_Tax;
	@Column
	private double Provident_Fund ;
	

	public user() {}
	

	public user(int id, String fname, String lname, String email, String phone, String password, double age,
			double gross_salary, double income_Tax, double professional_Tax, double provident_Fund) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.age = age;
		this.Gross_salary = gross_salary;
		this.Income_Tax = income_Tax;
		this.Professional_Tax = professional_Tax;
		this.Provident_Fund = provident_Fund;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getAge() {
		return age;
	}


	public void setAge(double age) {
		this.age = age;
	}


	public double getGross_salary() {
		return Gross_salary;
	}


	public void setGross_salary(double gross_salary) {
		Gross_salary = gross_salary;
	}


	public double getIncome_Tax() {
		return Income_Tax;
	}


	public void setIncome_Tax(double income_Tax) {
		Income_Tax = income_Tax;
	}


	public double getProfessional_Tax() {
		return Professional_Tax;
	}


	public void setProfessional_Tax(double professional_Tax) {
		Professional_Tax = professional_Tax;
	}


	public double getProvident_Fund() {
		return Provident_Fund;
	}


	public void setProvident_Fund(double provident_Fund) {
		Provident_Fund = provident_Fund;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "pwease [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	

	
}

