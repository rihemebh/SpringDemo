package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {
    /* spring can resolve which concrete class to implement from the var name that should be :
                    the name of the class
                    the value of the component annotation @component(value="greeter1")
       we can also have another name and put a qualifier annotation @Qualifier(value="  ClassName")
*/

    @Autowired
    private Greeter greeter1;

    @Autowired
    private FriendlyGreeter friendlyGreeter1;

    @Autowired
    private Greeter greeter2;

    @Autowired
    private FriendlyGreeter friendlyGreeter2;

    @RequestMapping("/hello1")
    public String helloworld1(){ return greeter1.greet(); }

    @RequestMapping("/FriendlyGreeter1")
    public String Friendly1(){ return friendlyGreeter1.greet(); }

    @RequestMapping("/hello2")
    public String helloworld2(){ return greeter2.greet(); }

    @RequestMapping("/FriendlyGreeter2")
    public String Friendly2(){ return friendlyGreeter2.greet(); }

}
