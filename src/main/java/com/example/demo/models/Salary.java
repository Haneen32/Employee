//package com.example.demo.models;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//@Entity(name="Salary")
//@Table(name="Salarys")
////@JsonIgnoreProperties(ignoreUnknown = true)
//public class Salary implements Serializable{
//
//	private static final long serialVersionUID = 1L;
//	@Id
//	  @GeneratedValue(strategy=GenerationType.AUTO)
//	@Column
//	private double Gross_salary;
//	@Column
//	private double Income_Tax;
//	@Column
//	private double Professional_Tax;
//	@Column
//	private double Provident_Fund ;
//	
//	public Salary() {}
//
//	public Salary(double gross_salary, double income_Tax, double professional_Tax,
//			double provident_Fund) {
//		super();
//		this.Gross_salary = gross_salary;
//		this.Income_Tax = income_Tax;
//		this.Professional_Tax = professional_Tax;
//		this.Provident_Fund = provident_Fund;
//	}
//
//
//	public double getGross_salary() {
//		return Gross_salary;
//	}
//	public void setGross_salary(double gross_salary) {
//		this.Gross_salary = gross_salary;
//	}
//	
//	public double getIncome_Tax() {
//		return Income_Tax;
//	}
//	public void setIncome_Tax(double income_Tax) {
//		this.Income_Tax = income_Tax;
//	}
//
//	public double getProfessional_Tax() {
//		return Professional_Tax;
//	}
//	public void setProfessional_Tax(double professional_Tax) {
//		this.Professional_Tax = professional_Tax;
//	}
//
//	public double getProvident_Fund() {
//		return Provident_Fund;
//	}
//	public void setProvident_Fund(double provident_Fund) {
//		this.Provident_Fund = provident_Fund;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//
//    public double NetSalary() {
//	    double pf=this.Provident_Fund*(this.Gross_salary/100);
//        double it=this.Income_Tax*(this.Gross_salary/100);
//        double pt=this.Professional_Tax*(this.Gross_salary/100);
//        double Net_Salary=this.Gross_salary-it-pt-pf;
//	    return Net_Salary;
//
//}
//
//}
