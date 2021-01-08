package com.example.demo.customer;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReactiveCustomerRepository {

    private static Map<Long,Customer>  customers = new HashMap<>();

    //mono<T> : handle 0 or 1 element
    Mono<Customer> save(Customer customer){
        customers.put(customer.getId(),customer);
        return Mono.justOrEmpty(customer);

    }

    Mono<Customer> findById(Long id){
        return Mono.justOrEmpty(customers.get(id));

    }

    //flux<T> : handle 1 to N elements
    Flux<Customer> findAll(){
        return Flux.fromIterable(customers.values());

    }

    Mono<Customer> deleteById(Long id){
        return Mono.justOrEmpty(customers.remove(id));
    }
}
