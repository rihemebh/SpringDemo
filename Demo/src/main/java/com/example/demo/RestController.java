package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private GreetInterface greeter;
    /* spring can resolve which concrete class from the var name that should be :
                    the name of the class
                    the value param in the component annotation @component(value="greeter1")
                    we can also have another name and put a qualifier annotation @Qualifier(value="  ClassName")
*/
    @Autowired
    private GreetInterface friendlyGreeter;

    @RequestMapping("/hello")
    public String helloworld(){ return greeter.greet(); } //output: Greet

    @RequestMapping("/FriendlyGreeter")
    public String Friendly(){ return friendlyGreeter.greet(); }//output: friendly greet

}
