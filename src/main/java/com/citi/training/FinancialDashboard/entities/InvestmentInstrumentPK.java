package com.citi.training.FinancialDashboard.entities;


import java.io.Serializable;
import java.util.Objects;

public class InvestmentInstrumentPK implements Serializable {
    private int accountId;
    private String symbol;

    public InvestmentInstrumentPK(int accountId, String symbol) {
        this.accountId = accountId;
        this.symbol = symbol;
    }

    public InvestmentInstrumentPK(){}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        InvestmentInstrumentPK pk = (InvestmentInstrumentPK) o;
        return Objects.equals(this.accountId, pk.accountId) && Objects.equals(this.symbol, ((InvestmentInstrumentPK) o).symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.symbol);
    }
}