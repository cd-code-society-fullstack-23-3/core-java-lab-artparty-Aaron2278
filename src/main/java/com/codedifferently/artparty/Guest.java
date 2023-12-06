package com.codedifferently.artparty;

import java.util.ArrayList;
import java.util.List;

public class Guest {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String reasonForVisit;

    public Guest(Long id, String firstName, String lastName, String email, String phone, String reasonForVisit) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.reasonForVisit = reasonForVisit;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getReasonForVisit() {
        return phone;
    }

    public String getPhone() {
        return reasonForVisit;
    }

}
