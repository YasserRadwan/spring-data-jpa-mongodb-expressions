package com.github.mhewedy.expressions.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ContactInfo {
    public String phone;
    public String email;

    public ContactInfo() {
    }

    public ContactInfo(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}
