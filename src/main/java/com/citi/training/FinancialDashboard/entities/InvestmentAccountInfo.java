package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "investment_acc_info")
public class InvestmentAccountInfo implements Serializable {

    @Id
    @Column(name = "aid")
    private int accountId;

    @Column(name = "investment_type")
    private InvestmentType investmentType;

    @Column(name = "cash")
    private Double cash;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(InvestmentType investmentType) {
        this.investmentType = investmentType;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}