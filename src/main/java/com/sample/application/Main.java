package com.sample.application;

import com.sample.application.model.Customer;
import com.sample.application.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan({"com.sample.application"})
@EnableAutoConfiguration
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());


    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    /**
     * Initializing the in-memory h2 database.
     */
    @PostConstruct
    public void initCustomerDatabase() {
        logger.info("initializing the database");
        customerRepository.save(new Customer("Aruna", 30, "Colombo", "Sri Lanka"));
        customerRepository.save(new Customer("Sameera", 35, "Boston", "United States"));
        customerRepository.save(new Customer("Brian", 25, "London", "United Kingdom"));
        customerRepository.save(new Customer("Sampath", 40, "Anuradhapura", "Sri Lanka"));
        customerRepository.save(new Customer("Jennifer", 43, "Seattle", "United States"));


       for(Customer customer : customerRepository.findAll()) {
           logger.info(customer.toString());
       }
    }
}