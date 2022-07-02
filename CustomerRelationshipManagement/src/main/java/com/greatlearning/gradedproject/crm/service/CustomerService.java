package com.greatlearning.gradedproject.crm.service;

import java.util.List;
import com.greatlearning.gradedproject.crm.entity.Customers;

public interface CustomerService {
	
	void saveCustomers(Customers customer);

	Customers findCustomersById(long customerId);

	List<Customers> findAllCustomers();

	void deleteCustomersById(long customerId);
}
