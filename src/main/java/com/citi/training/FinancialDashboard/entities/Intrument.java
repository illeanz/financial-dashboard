package com.citi.training.FinancialDashboard.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "instruments")
public class Intrument {

    @Id
    @Column(name="symbol")
    private String symbol;

    @Column(name="instr_name")
    private String value;

    @Column(name="instr_type")
    private InstrumentType instrumentType;

    @Column(name="market_price")
    private Double price;
}
