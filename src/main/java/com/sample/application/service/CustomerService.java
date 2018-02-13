package com.sample.application.service;

import com.sample.application.model.Customer;
import com.sample.application.repository.CustomerRepository;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Service class implementation for the customer service.
 */
@Component
public class CustomerService {

    private static final org.apache.logging.log4j.Logger perfLogger = LogManager.getLogger();

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        long startTime = System.nanoTime();
        List<Customer> list = customerRepository.findAll();
        long endTime = System.nanoTime();
        perfLogger.log(Level.getLevel("PERF"), "Getting All customers, Time Taken={}ms", (endTime - startTime) / 1e6);
        return list;
    }
}
