package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "investments")
@IdClass(InvestmentId.class)
public class Investment implements Serializable{

    @Id
    @Column(name="aid")
    private int accountId;

    @Id
    @Column(name="symbol")
    private String symbol;

    @Column(name="position")
    private int position;

    @Column(name="avg_price")
    private double averagePrice;

    public Investment() {
    }

    public Investment(int accountId, String symbol, int position, double averagePrice) {
        this.accountId = accountId;
        this.symbol = symbol;
        this.position = position;
        this.averagePrice = averagePrice;
    }

//    public InvestmentId getinvestmentId() {
//        return new InvestmentId(this.accountId, this.symbol);
//    }

//    public void setinvestmentId(InvestmentId investmentId) {
//        this.accountId = investmentId.getAccountId();
//        this.symbol = investmentId.getSymbol();
//    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }
}
