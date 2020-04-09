package com.cts.customer.dao;



import java.util.List;

import com.cts.customer.entity.Customer;

public interface CustomerDAO {
  public List<Customer> getAllCustomers();
  public void saveCustomer(Customer cus);
  public Customer getCustomer(int id);
  public void deleteCustomer(int id);
  public Customer searchCustomer(int id);
}

