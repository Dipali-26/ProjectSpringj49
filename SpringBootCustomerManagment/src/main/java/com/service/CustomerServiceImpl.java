package com.service;
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	public Customer addCustomer(Customer c) {

		return customerRepo.save(c);
	}
   @Override
   public List<Customer> getAllCustomer()
   {
	   return customerRepo.findAll();
   }
	   @Override
		public Customer getOneCustomer(int id) 
	   {
			return customerRepo.findById(id).orElse(null);
       }
	@Override
	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);
		
	}
	@Override
	public Customer updateCustomer(Customer c) {
		Customer existCustomer=customerRepo.findById(c.getId()).orElse(null);
		existCustomer.setName(c.getName());
		return customerRepo.save(existCustomer);
	}		   
}


	
	
	

