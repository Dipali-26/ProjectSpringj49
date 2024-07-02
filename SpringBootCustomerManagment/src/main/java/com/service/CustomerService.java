package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService
{
	       public Customer addCustomer(Customer  c);
	       
		   public List<Customer> getAllCustomer();
		   
		   public Customer getOneCustomer(int id);
		   
		   public void deleteCustomer(int id);
		   
		   public Customer updateCustomer(Customer c);
		   
				       
}
