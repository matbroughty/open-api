package com.broughty.restapi.services;

import com.broughty.restapi.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class AccountingService {

  public Customer findCustomerById(String customerId, String companyId) {

    Customer customer = new Customer(customerId, "JimmyO1");
    customer.setAccountName("Jimmys Cars");
    customer.setCompanyId(companyId);
    customer.setAccountNotified(true);
    customer.setAddress1("A house");

    return customer;

  }

}
