package com.example.userregistrationapp.Data;

import java.util.Date;

public class User {
    private String firstName, lastName, mobile, address, email, password;
    private Date dateOfBirth;
    public User(String firstName, String lastName, String mobile, String address,
                String email, String password, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "User { " +
                "firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", mobile='" + mobile + '\n' +
                ", address='" + address + '\n' +
                ", email='" + email + '\n' +
                ", password='" + password + '\n' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}