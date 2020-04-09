package com.cts.customer.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cts.customer.entity.Customer;
import com.cts.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
    
	@GetMapping("/list")
    public String listCustomers(Model theModel)
    {
		List<Customer> customers= customerService.getAllCustomers();
		theModel.addAttribute("customers",customers);
		customers.forEach(s -> System.out.println(s));
    	return "customer-list";
    }
	
    @GetMapping("/addCustomer")
	public String addEmployee(Model model) {
    	Customer c1=new Customer();
		model.addAttribute("customer",c1);
		return "customer-add-form";
	}
    
    @PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer cus,BindingResult bind)
	{
    	if(bind.hasErrors())
    	{
    		System.out.println(bind);
    		return "customer-add-form";
    	}
    	else
    	{
    		customerService.saveCustomer(cus);
		   return "redirect:/customer/list";
    	}
	}
    
    @GetMapping("/updateCustomer")
    public String updateCustomer(@RequestParam("customerId") int id,Model model)
	{
    	Customer cus=customerService.getCustomer(id);
		model.addAttribute("customer", cus);
		return "customer-update-form";
	}
    
    @GetMapping("/deleteCustomer")
	public String delete(@RequestParam("customerId") int id)
	{
    	customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
    
    @GetMapping("/searchCustomer")
  	public String searchCustomer(@RequestParam("customerId") int id, Model model)
  	{
    	Customer cus=customerService.searchCustomer(id);
      	model.addAttribute("customer", cus);
  		return "customer-search-form";
  	}
    @GetMapping("/regCustomer")
   	public String regEmployee(Model model) {
       	Customer c1=new Customer();
   		model.addAttribute("customer",c1);
   		return "customer-register";
   	}
    @PostMapping("/saCustomer")
	public String saCustomer(@Valid @ModelAttribute("customer") Customer cus,BindingResult bind)
	{
    	if(bind.hasErrors())
    	{
    		System.out.println(bind);
    		return "customer-register";
    	}
    	else
    	{
    		customerService.saveCustomer(cus);
		   return "redirect:/customer-login.jsp";
    	}
	}
}
