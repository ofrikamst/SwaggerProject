package com.example.CheckCustomer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping(value="/check-customer", method= RequestMethod.POST, consumes={"application/json"})
    public ResponseEntity<Object> isCustomerValid(@RequestBody Customer customer) throws JsonProcessingException {
        System.out.println(customer);
        ObjectMapper objectMapper = new ObjectMapper();
        return ResponseEntity.status(HttpStatus.OK).body(objectMapper.readTree(customer.toJsonString()));
    }
}
