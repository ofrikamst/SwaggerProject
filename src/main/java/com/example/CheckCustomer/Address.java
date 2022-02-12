package com.example.CheckCustomer;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class Address {

    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @NotNull
    private String postalCode;

    @Override
    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\"' +
                '}';
    }
}
