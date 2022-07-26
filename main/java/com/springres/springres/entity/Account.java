package com.springres.springres.entity;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int accountNo;

    @OneToOne
   // @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column
    private long currentBalance ;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Account(int accountNo, Customer customer, long currentBalance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.currentBalance = currentBalance;
    }

    public Account() {
    }
}
