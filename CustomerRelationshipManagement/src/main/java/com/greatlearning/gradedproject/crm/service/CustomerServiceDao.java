package com.greatlearning.gradedproject.crm.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.gradedproject.crm.entity.Customers;

@Repository
public class CustomerServiceDao implements CustomerService {

	private Session session;
	private SessionFactory sessionFactory;
	
	@Autowired
	public CustomerServiceDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory=sessionFactory;
		try {
			this.session=this.sessionFactory.getCurrentSession();
		}
		catch(HibernateException ex) {
			this.session=this.sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public void saveCustomers(Customers customer) {
		Transaction transaction = this.session.beginTransaction();
		this.session.saveOrUpdate(customer);
		transaction.commit();
	}

	@Override
	public Customers findCustomersById(long customerId) {
		// TODO Auto-generated method stub
		return this.session.get(Customers.class, customerId);
	}

	@Override
	public List<Customers> findAllCustomers() {
		return this.session.createQuery("from Customers").list();
	}

	@Override
	@Transactional
	public void deleteCustomersById(long customerId) {
		Customers customers = findCustomersById(customerId);
		Transaction transaction = this.session.beginTransaction();
		this.session.delete(customers);
		transaction.commit();		
	}
}
