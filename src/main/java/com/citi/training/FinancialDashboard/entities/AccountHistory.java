package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "account_history")
@IdClass(AccountHistoryPK.class)
public class AccountHistory implements Serializable{

    @Id
    @Column(name="aid")
    private int accountId;

    @Id
    @Column(name="date")
    private Date date;

    @Column(name="value")
    private Double value;

    public AccountHistory(int accountId, Date date, Double value) {
        this.accountId = accountId;
        this.date = date;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public void setValue(Double value) {
        this.value = value;
    }

}

