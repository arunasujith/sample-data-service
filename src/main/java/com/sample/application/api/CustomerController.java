package com.sample.application.api;

import com.sample.application.model.Customer;
import com.sample.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Customer API controller.
 */
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomers() {

        return customerService.getAllCustomers();
    }


}
