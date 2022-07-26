package com.springres.springres.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    //@OneToOne(mappedBy = "Customer", targetEntity= Account.class,  cascade = CascadeType.ALL)
    private int customer_id;

    @Column
    private String panNumber;

    @Column
    private String aadharNumber;

    @Column
    private String customerName;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String dateOfBirth;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Customer(int customer_id, String panNumber, String aadharNumber, String customerName, String email, String address, String dateOfBirth) {
        this.customer_id = customer_id;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer() {
    }
}
