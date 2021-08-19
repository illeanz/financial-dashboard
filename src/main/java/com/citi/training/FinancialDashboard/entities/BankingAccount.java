package com.citi.training.FinancialDashboard.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Immutable
@Table(name = "banking_accounts")
public class BankingAccount implements Serializable {

    @Id
    @Column(name="aid")
    private int accountId;

    @Column(name="uid")
    private int userId;

    @Column(name="acc_name")
    private String accountName;

    @Column(name="acc_type")
    private AccountType accountType;

    @Column(name="banking_acc_type")
    private BankingType bankingType;

    @Column(name="interest_rate")
    private Double interestRate;

    public BankingAccount(int accountId, int userId, String accountName, AccountType accountType, BankingType bankingType, Double interestRate) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.bankingType = bankingType;
        this.interestRate = interestRate;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public BankingType getBankingType() {
        return bankingType;
    }

    public Double getInterestRate() {
        return interestRate;
    }
}





