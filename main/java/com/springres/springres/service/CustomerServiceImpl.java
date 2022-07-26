package com.springres.springres.service;

import com.springres.springres.entity.Customer;
import com.springres.springres.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements  CustomerService{

    @Autowired
    private CustomerRepository customerRepositoryDao;

    @Override
    public Customer adduser(Customer customer) {
        return customerRepositoryDao.save(customer);
    }
}
