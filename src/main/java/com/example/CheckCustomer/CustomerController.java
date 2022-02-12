package com.example.CheckCustomer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class CustomerController {

    @RequestMapping(value="/check-customer", method= RequestMethod.POST, consumes={"application/json"})
    public ResponseEntity<Object> isCustomerValid(@RequestBody @Valid Customer customer) {
        System.out.println(customer);
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }
}
