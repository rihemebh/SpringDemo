package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.lang.*;
import java.util.Collections;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @RequestMapping(value="/customer", method= RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){
        return repo.save(customer);
    }
    @RequestMapping(value="/customer", method= RequestMethod.PUT)
    public Customer update (@RequestBody Customer customer){
        return repo.save(customer);
    }

    @RequestMapping(value="/customer/{id}", method= RequestMethod.GET)
    public Customer get(@PathVariable Long id){
        return  repo.findById(id).orElse(null);
    }

    @RequestMapping(value="/customer/{id}", method= RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
