package com.citi.training.FinancialDashboard.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Immutable
@Table(name = "investment_instruments")
@IdClass(InvestmentInstrumentPK.class)
public class InvestmentInstrument implements Serializable {

    @Id
    @Column(name="aid")
    private int accountId;

    @Id
    @Column(name = "symbol")
    private String symbol;

    @Column(name="uid")
    private int userId;

    @Column(name="acc_name")
    private String accountName;

    @Column(name="investment_acc_type")
    private InvestmentType investmentType;

    @Column(name="position")
    private int position;

    @Column(name="avg_price")
    private double averagePrice;

    @Column(name="instr_name")
    private String value;

    @Column(name="instr_type")
    private InstrumentType instrumentType;

    @Column(name="market_price")
    private Double price;

    public int getUserId() {
        return userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPosition() {
        return position;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public String getValue() {
        return value;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public Double getPrice() {
        return price;
    }
}





