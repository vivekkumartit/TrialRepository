package com.vivek.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.vivek.customerdatamanagement.dto.ResponseStructure;
import com.vivek.customerdatamanagement.entity.Customer;
import com.vivek.customerdatamanagement.repository.CustomerDAO;
import com.vivek.customerdatamanagement.repository.CustomerRepository;
@Service
public class CustomerService {
	
//	@Autowired
//	private CustomerRepository repository;
    @Autowired
	private CustomerDAO dao;
	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
//	
//	public List<Customer> getAllCustomerData() {
//		return dao.getAllCustomerData();
//	}
	public Customer updateCustomer(Customer customer) {
		Customer cus = dao.saveCustomer(customer);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		
	}
	
	public Customer getDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	public List<Customer> getCustomerByName(String name){
		return dao.getCustomerByName(name);
	}
	public List<Customer> validateCustomer(String name,String email){
		return dao.validateCustomer(name, email);
	}
	
}
