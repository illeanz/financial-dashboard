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

    @Column(name="name")
    private String name;

    @Column(name="acc_type")
    private AccountType accountType;

    @Column(name="date")
    private Date date;

    @Column(name="value")
    private int value;

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


}
