package com.vivek.customerdatamanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.customerdatamanagement.entity.Customer;
import com.vivek.customerdatamanagement.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@PutMapping("/customer")
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
	@GetMapping("/customer")
	public @ResponseBody List<Customer> getAllCustomerData() {
		return service.getAllCustomerData();
	}
	@GetMapping("/customer/{id}")
	public Customer getCustomerDataById(@PathVariable("id")int id) {
		return service.getCustomerDataById(id);
	}

	
	@GetMapping("/customer/{name}")
	public List<Customer> getCustomerByName(String name){
		return service.getCustomerByName(name);
	}
	
	
	@PostMapping("/validatecustomer")
	public List<Customer> validateCustomer(@RequestParam("name") String name,@RequestParam("email")String email){
		return service.validateCustomer(name, email);
	}
	
	
}

																																																										