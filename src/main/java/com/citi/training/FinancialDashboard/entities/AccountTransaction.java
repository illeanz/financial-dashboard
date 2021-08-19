package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "account_transactions")
public class AccountTransaction implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="trans_id")
    private int transactionId;

    @Column(name="aid")
    private int accountId;

    @Column(name="date")
    private Date date;

    @Column(name="desc")
    private String description;

    @Column(name="value")
    private Double value;

    public AccountTransaction(int transactionId, int accountId, Date date, String description, Double value) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.date = date;
        this.description = description;
        this.value = value;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
