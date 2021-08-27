package com.citi.training.FinancialDashboard.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class AccountHistoryId implements Serializable {
    private int accountId;
    private Date date;

    public AccountHistoryId(int accountId, Date date) {
        this.accountId = accountId;
        this.date = date;
    }

    public AccountHistoryId(){}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        AccountHistoryId pk = (AccountHistoryId) o;
        return Objects.equals(this.accountId, pk.accountId) && Objects.equals(this.date, ((AccountHistoryId) o).date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.date);
    }
}