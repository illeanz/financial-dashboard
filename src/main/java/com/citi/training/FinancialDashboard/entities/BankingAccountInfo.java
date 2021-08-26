package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "banking_acc_info")
public class BankingAccountInfo implements Serializable {

    @Id
    @Column(name="aid")
    private int accountId;

    @Column(name="banking_type")
    private BankingType bankingType;

    @Column(name="interest_rate")
    private Double interestRate;

    public BankingAccountInfo() {
    }

    public BankingAccountInfo(int accountId, BankingType bankingType, Double interestRate) {
        this.accountId = accountId;
        this.bankingType = bankingType;
        this.interestRate = interestRate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public BankingType getBankingType() {
        return bankingType;
    }

    public void setBankingType(BankingType bankingType) {
        this.bankingType = bankingType;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}





