package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer c)
	{
		return customerService.addCustomer(c);
	}
	@GetMapping("/getAll")
	public List<Customer> getAllCustomer() {
		
		return customerService.getAllCustomer();
	}
		@GetMapping("/getOne/{id}")
		public Customer getOneCustomer(@PathVariable int id) {
			return customerService.getOneCustomer(id);
	}
		
		@DeleteMapping("/delete/{id}")
		public void deleteCustomer(@PathVariable int id)
		{
			customerService.deleteCustomer(id);
		}
		
		@PutMapping("/update")
		public Customer updateCustomer(@RequestBody Customer c)
		{
			return customerService.updateCustomer(c);
		}
	
	 
}	


