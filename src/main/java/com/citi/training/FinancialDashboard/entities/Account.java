package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="aid")
    private int accountId;

    @Column(name="uid")
    private int userId;

    @Column(name="acc_name")
    private String name;

    @Column(name="acc_type")
    private String accountType;

    @Column(name="value")
    private Double value;

    public Account() {}

    public Account(int accountId, int userId, String name, String accountType, Double value) {
        this.accountId = accountId;
        this.userId = userId;
        this.name = name;
        this.accountType = accountType;
        this.value = value;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public Account(int accountId, int userId, String name, AccountType accountType, Date date, int value) {
        this.accountId = accountId;
        this.userId = userId;
        this.name = name;
        this.accountType = accountType;
        this.date = date;
        this.value = value;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Double getValue() {
        return value;
    }
}
