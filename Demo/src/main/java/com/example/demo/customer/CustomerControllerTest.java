package com.example.demo.customer;

import com.example.demo.Main;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class CustomerControllerTest {

    @Autowired
    private WebApplicationContext appContext;

    private MockMvc mvc;

    @Before
    public void setup(){
        mvc= MockMvcBuilders.webAppContextSetup(appContext).build();
    }

    @Test
    public void customerController() throws Exception{
        Customer customer = new Customer();
    customer.setName("Riheme");
    customer.setAge(21);
    mvc.perform(post("/customer").contentType(MediaType.APPLICATION_JSON).content(Objects.requireNonNull(toJson(customer))))
        .andExpect(status().isOk());
        mvc.perform(get("/customer/1")).andExpect(status().isOk()).andExpect(jsonPath("$.id").exists());
        mvc.perform(delete("/customer/1")).andExpect(status().isOk());
    }
    private String toJson(Object obj){
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }

}
