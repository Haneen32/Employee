//package com.example.demo.service;
//
//
//import java.util.Collection;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.DAO.SalaryDAO;
//import com.example.demo.DAO.userDAO;
//import com.example.demo.models.Salary;
//import com.example.demo.models.user;
//
//@Service
//@Transactional
//public class SalaryService {
//
//	@Autowired
//	private SalaryDAO repos;
//	
//	public Salary addSalary(Salary u)	{
//		return repos.save(u);
//	}
//	
//	
//	 public Collection<Salary> getAllUser(){
//		return repos.findAll(); 
//	 }
//		
//	 public void removeEmp(int id)
//	 {
//		 repos.deleteById(id);
//	 }
//	 public void deleteSalary(Salary u) {
//		 repos.delete(u);
//	 }
//	 
//	 public Salary updateSalary (Salary u) {
//		 return repos.save(u);
//	 }
//
//	public Salary saveSalary(Salary u) {
//		 return repos.save(u);
//	}
//	 
//}
