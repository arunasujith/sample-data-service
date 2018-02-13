package com.sample.application.repository;

import com.sample.application.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer save(Customer customer);

    List<Customer> findAll();

}