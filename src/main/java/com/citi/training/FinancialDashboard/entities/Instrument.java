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
    private InstrumentType instrumentType;

    @Column(name="market_price")
    private Double price;

    public Instrument() {
    }

    public Instrument(String symbol, String value, InstrumentType instrumentType, Double price) {
        this.symbol = symbol;
        this.value = value;
        this.instrumentType = instrumentType;
        this.price = price;
    }
}
