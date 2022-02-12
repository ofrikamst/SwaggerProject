package com.example.CheckCustomer;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Customer {

    @NotNull(message = "firstName cannot be empty")
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Min(1)
    private int age;
    @NotNull
    @Valid
    private Address address;
    @NotNull
    private String phoneNumber;

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
