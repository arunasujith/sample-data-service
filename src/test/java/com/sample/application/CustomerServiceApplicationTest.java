package com.sample.application;


import com.sample.application.api.CustomerController;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@Ignore
@WebAppConfiguration
@EnableWebMvc
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = {CustomerController.class, Main.class})
public class CustomerServiceApplicationTest {

    protected MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Before
    public void Before() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
