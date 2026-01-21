package com.github.mhewedy.expressions.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Address {
    public String street;
    public String city;
    @Embedded
    public ContactInfo contactInfo;

    public Address() {
    }

    public Address(String street, String city, ContactInfo contactInfo) {
        this.street = street;
        this.city = city;
        this.contactInfo = contactInfo;
    }
}
