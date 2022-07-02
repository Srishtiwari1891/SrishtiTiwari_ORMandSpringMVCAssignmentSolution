package com.greatlearning.gradedproject.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.gradedproject.crm.entity.Customers;
import com.greatlearning.gradedproject.crm.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(name = "/list")
	public String listCustomers(Model model) {
		List<Customers> customers = customerService.findAllCustomers();
		model.addAttribute("customer", customers);
		return "list-customers";
	}

	@PostMapping("/save")
	public String saveCustomers(@RequestParam("customerId") long customerId,
			@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email) {
		Customers customers = null;
		if (customerId == 0)
			customers = new Customers(firstName, lastName, email);
		else {
			customers = customerService.findCustomersById(customerId);
			customers.setFirstName(firstName);
			customers.setLastName(lastName);
			customers.setEmail(email);
		}
		customerService.saveCustomers(customers);
		return "redirect:list";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("customers", new Customers());
		model.addAttribute("mode", "Add");
		return "customer-form";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(Model model, @RequestParam("customerId") long customerId) {
		Customers customers = customerService.findCustomersById(customerId);
		model.addAttribute("customers",customers);
		model.addAttribute("mode","Update");
		return "customer-form";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") long customerId) {
		customerService.deleteCustomersById(customerId);
		return "redirect:list";
	}
}
