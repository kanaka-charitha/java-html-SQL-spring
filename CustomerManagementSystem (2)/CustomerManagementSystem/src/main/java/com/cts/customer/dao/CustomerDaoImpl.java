package com.cts.customer.dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.customer.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	SessionFactory factory;

	@Override
	public List<Customer> getAllCustomers() {
	    Session session =factory.getCurrentSession();
	    Query<Customer> query =session.createQuery("from Customer",Customer.class);
	    List<Customer> cusList=query.getResultList();
	    return cusList;
	}

	@Override
	public void saveCustomer(Customer cus) {
		Session session =factory.getCurrentSession();
		session.saveOrUpdate(cus);
		System.out.println(cus);
	}

	@Override
	public Customer getCustomer(int id) {
		Session session =factory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		Session session =factory.getCurrentSession();
		Customer cu=session.get(Customer.class, id);
		session.delete(cu);
		System.out.println("Deleted!");
	}
	@Override
	public Customer searchCustomer(int id) {
		Session session =factory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		return customer;
	}

}

