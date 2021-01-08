package com.example.demo.customer;


import com.example.demo.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repo;

    @Test
    public void textRepository(){

    }
}
