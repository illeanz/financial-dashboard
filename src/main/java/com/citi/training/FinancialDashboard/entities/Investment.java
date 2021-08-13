package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "investments")
public class Investment implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="aid")
    private int accountId;

    @Column(name="symbol")
    private String symbol;

    @Column(name="position")
    private int position;

    @Column(name="avg_price")
    private double averagePrice;

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
