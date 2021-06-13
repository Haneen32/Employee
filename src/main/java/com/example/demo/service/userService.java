package com.example.demo.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.userDAO;
import com.example.demo.models.user;

@Service
@Transactional
public class userService {

	@Autowired
	private userDAO repos;
	
	public user addUser(user usr)	{
		return repos.save(usr);
	}
	
	public user login(String  email ,String password)
	{
		return repos.login(email, password);
	}
	
	 public Collection<user> getAllUser(){
		return repos.findAll(); 
	 }
		
	 public void removeEmp(int id)
	 {
		 repos.deleteById(id);
	 }
	 public void deleteUser(user u) {
		 repos.delete(u);
	 }
	 
	 public user updateUser (user u) {
		 return repos.save(u);
	 }

	public user saveUser(user u) {
		 return repos.save(u);
	}
	public double NetSalary(user u) {
	    double pf=u.getProvident_Fund()*(u.getGross_salary()/100);
        double it=u. getIncome_Tax()*(u.getGross_salary()/100);
        double pt=u.getProfessional_Tax()*(u.getGross_salary()/100);
        double Net_Salary=u.getGross_salary()-it-pt-pf;
	    return Net_Salary;

}
	 
	}