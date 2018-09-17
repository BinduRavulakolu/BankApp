package com.capgemini.bankapp.dao.impl;

import java.util.Set;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.database.BankAccountDatabase;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public Customer authenticate(Customer customer) {
		Set<Customer> details = BankAccountDatabase.getAllCustomerDetails();
		for (Customer c : details) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				if (c.getPassword().equals(customer.getPassword())) {
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		Set<Customer> details = BankAccountDatabase.getAllCustomerDetails();
		for (Customer c : details) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setCustomerName(customer.getCustomerName());
				c.setEmail(customer.getEmail());
				c.setAddress(customer.getAddress());
				c.setDateOfBirth(customer.getDateOfBirth());
//				c.setPassword(customer.getPassword());
				return c;
			}

		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		Set<Customer> details = BankAccountDatabase.getAllCustomerDetails();
		for (Customer c : details) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				if (c.getPassword().equals(oldPassword)) {
					c.setPassword(newPassword);
					return true;
				}
			}
//		return false;
		}
		return false;

	}
}
