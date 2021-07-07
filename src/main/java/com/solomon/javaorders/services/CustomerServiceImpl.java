package com.solomon.javaorders.services;

import com.solomon.javaorders.models.Customer;
import com.solomon.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerServices")
public class CustomerServiceImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository customersrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customersrepos.save(customer);
    }
}