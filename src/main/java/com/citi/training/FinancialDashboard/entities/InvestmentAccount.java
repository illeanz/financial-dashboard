package com.citi.training.FinancialDashboard.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Immutable
@Table(name = "investment_accounts")
public class InvestmentAccount implements Serializable {

    @Id
    @Column(name="aid")
    private int accountId;

    @Column(name="uid")
    private int userId;

    @Column(name="acc_name")
    private String accountName;

    @Column(name="acc_type")
    private String accountType;

    @Column(name="value")
    private double value;

    @Column(name="investment_acc_type")
    private InvestmentType investmentType;

    @Column(name="cash")
    private Double cash;

    public InvestmentAccount() {
    }

    public InvestmentAccount(int accountId, int userId, String accountName, String accountType, double value, InvestmentType investmentType, Double cash) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.value = value;
        this.investmentType = investmentType;
        this.cash = cash;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getValue() {
        return value;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public Double getCash() {
        return cash;
    }

}





