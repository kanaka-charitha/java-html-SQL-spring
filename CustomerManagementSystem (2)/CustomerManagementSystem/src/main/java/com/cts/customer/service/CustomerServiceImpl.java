package com.cts.customer.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.customer.dao.CustomerDAO;
import com.cts.customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDao;
	
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		
		return customerDao.getAllCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer emp) {
		customerDao.saveCustomer(emp);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}
	@Override
	@Transactional
	public Customer searchCustomer(int id) {
		return customerDao.searchCustomer(id);
	}
	
}
