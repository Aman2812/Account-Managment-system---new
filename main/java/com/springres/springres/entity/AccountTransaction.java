package com.springres.springres.entity;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountTransaction {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long transaction_Id;

    @Column
    private long transactionRefNo;

    @Column
    private int accountNo;

    @Column
    private String type;

    @Column
    private String subtype;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dateTime;

    @Column
    private long currentBalance;

    public long getTransaction_Id() {
        return transaction_Id;
    }

    public void setTransaction_Id(long transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public long getTransactionRefNo() {
        return transactionRefNo;
    }

    public void setTransactionRefNo(long transactionRefNo) {
        this.transactionRefNo = transactionRefNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public AccountTransaction(long transactionRefNo, int accountNo, String type, String subtype, Date dateTime) {
        this.transactionRefNo = transactionRefNo;
        this.accountNo = accountNo;
        this.type = type;
        this.subtype = subtype;
        this.dateTime = dateTime;
    }

    public AccountTransaction() {
    }
}
