package com.solomon.javaorders.repositories;

import com.solomon.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
}