package com.example.demo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.service.userService;



@RestController
public class adminControl {

	@Autowired
	private userService uDao;
	
	@GetMapping(value="/admin/login/{email}/{password}")
	public user login(@PathVariable String  email , @PathVariable String  password)
	{
		return uDao.login(email, password);
		
	}
	@PostMapping(value= "/admin/addUser")
		public user  addUser(@RequestBody user usr)
		{
			user n = new  user();
			System.out.println(usr);
			n.setEmail(usr.getEmail());
			n.setId(usr.getId());
			n.setFname(usr.getFname());
			n.setLname(usr.getLname());
			n.setPhone(usr.getPhone());
			n.setAge(usr.getAge());
			n.setPassword(usr.getPassword());
			n.setGross_salary(usr.getGross_salary());
			n.setIncome_Tax(usr.getIncome_Tax());
			n.setProfessional_Tax(usr.getProfessional_Tax());
			n.setProvident_Fund(usr.getProvident_Fund());

			uDao.saveUser(n);
			
			 HttpHeaders httpHeaders = new HttpHeaders();
			 return n;
		}
		@GetMapping("/admin/getAll")
		public Collection<user>getAllUsers()
		{
			return uDao.getAllUser();
		}
	
		
		
		@RequestMapping("/admin/hi")
		@ResponseBody
		public String printHi()
		{
			return "hi";
		}
		
		@DeleteMapping("admin/deleteUser/{id}")
		public void removeById(@RequestParam(name="id") int id)
		{
			uDao.removeEmp(id);
			
		}
		@PostMapping(value="admin/addUser", consumes ="application/json",produces ="application/json")
		public user addUsers(@RequestBody user u) {
			System.out.println(u);
			return uDao.addUser(u);
		}

		@GetMapping("/admin/salary")
		public double salary(user u)
		{
			return uDao.NetSalary(u);
		}
		
	
		
	}

	
		
	