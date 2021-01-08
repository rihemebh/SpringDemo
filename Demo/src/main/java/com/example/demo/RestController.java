package com.example.demo;

import com.example.demo.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    /* spring can resolve which concrete class to implement from the var name that should be :
                    the name of the class
                    the value of the component annotation @component(value="greeter1")
       we can also have another name and put a qualifier annotation @Qualifier(value="  ClassName")
*/

//    @Autowired
//    private Greeter greeter;
//
//    @Autowired
//    private FriendlyGreeter friendlyGreeter;
//
//
//
//    @RequestMapping("/hello")
//    public String helloworld1(){ return greeter.greet(); }
//
//    @RequestMapping("/FriendlyGreeter")
//    public String Friendly1(){ return friendlyGreeter.greet(); }

@Autowired
    private CustomerRepository repo;


}
