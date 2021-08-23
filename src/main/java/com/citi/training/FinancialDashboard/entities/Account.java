package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private AccountType accountType;


    @Column(name="value")
    private Double value;

    public int getUserId() {
        return userId;
    }

    public AccountType getAccountType() {
        return accountType;
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
