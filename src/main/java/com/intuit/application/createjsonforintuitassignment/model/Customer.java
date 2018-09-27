package com.intuit.application.createjsonforintuitassignment.model;

import javax.persistence.Id;

import org.springframework.context.annotation.Bean;

public class Customer {
	@Id
	private int customerId;
	private String customerName;
	private String cardNumber;
	private int cvv;
	
	public Customer(){}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

}
