package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "banking")
public class BankingRecord implements Serializable {
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

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="aid")
    private int accountId;

    @Column(name="banking_type")
    private BankingType bankingType;

    @Column(name="interest_rate")
    private Double interestRate;
}





