package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "instruments")
public class Instrument {

    @Id
    @Column(name="symbol")
    private String symbol;

    @Column(name="instr_name")
    private String value;

    @Column(name="instr_type")
    private String instrumentType;

    @Column(name="market_price")
    private Double price;

    public Instrument() {
    }

    public Instrument(String symbol, String value, String instrumentType, Double price) {
        this.symbol = symbol;
        this.value = value;
        this.instrumentType = instrumentType;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
