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
    private AccountType accountType;

    @Column(name="value")
    private double value;

    @Column(name="investment_acc_type")
    private InvestmentType investmentType;

    @Column(name="cash")
    private Double cash;

    public int getAccountId() {
        return accountId;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public AccountType getAccountType() {
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





