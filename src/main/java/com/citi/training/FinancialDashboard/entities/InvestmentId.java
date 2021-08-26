package com.citi.training.FinancialDashboard.entities;

import java.io.Serializable;
import java.util.Objects;

public class InvestmentId implements Serializable {
    private int accountId;

    private String symbol;

    public InvestmentId() {
    }

    public InvestmentId(int accountId, String symbol) {
        this.accountId = accountId;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvestmentId)) return false;
        InvestmentId that = (InvestmentId) o;
        return accountId == that.accountId && symbol.equals(that.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, symbol);
    }
}
