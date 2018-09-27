package com.intuit.application.createjsonforintuitassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.application.createjsonforintuitassignment.model.Customer;
import com.intuit.application.createjsonforintuitassignment.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer){
		
		String cardNum = customer.getCardNumber();
		
		String maskCardNum = customerService.processedCardNum(cardNum);
		
		System.out.println(maskCardNum);
		customer.setCardNumber(maskCardNum);
		return customer;
	}
	// Assumes that get all customers, we can implement for get by Id also
	@GetMapping
	public Customer getCustomers() {
		// returning static customer object with static values just for reference
		
		Customer customer = new Customer();
		customer.setCustomerId(12345);
		customer.setCardNumber("123456678");
		customer.setCvv(123);
		customer.setCustomerName("reddy");
		
		return customer;
	}

}
