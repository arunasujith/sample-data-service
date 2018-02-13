package com.sample.application.api;

import com.sample.application.CustomerServiceApplicationTest;
import com.sample.application.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CustomerControllerTest extends CustomerServiceApplicationTest {
    @Autowired
    private CustomerController customerController;

    @Test
    public void getOffer() throws Exception {
        List<Customer> customerList = customerController.getCustomers();
        Assert.assertNotNull(customerList);
        Assert.assertEquals(5, customerList.size());
    }

}

