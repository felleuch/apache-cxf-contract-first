package com.mycompany.services.customer.impl;

import com.example.customerservice.Customer;
import com.example.customerservice.CustomerService;
import com.example.customerservice.NoSuchCustomerException;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  public void updateCustomer(Customer customer) {
    System.out.println("Customer updated successfully...");
  }

  public List<Customer> getCustomersByName(String name) throws NoSuchCustomerException {
    List<Customer> customers = new ArrayList<Customer>();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();
    customer1.setName("Pseudo Architect");
    customer1.setCustomerId(12345);
    customer2.setName("Real Architect");
    customer2.setCustomerId(54321);

    customers.add(customer1);
    customers.add(customer2);
    return customers;
  }
}
