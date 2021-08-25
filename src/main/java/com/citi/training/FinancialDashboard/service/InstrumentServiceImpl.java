package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Instrument;
import com.citi.training.FinancialDashboard.entities.InstrumentType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InstrumentServiceImpl implements  InstrumentService{

    @Override
    public Instrument findBySymbol(String symbol) {
        return null;
    }

    @Override
    public Collection<Instrument> findByInstrumentType(InstrumentType instrumentType) {
        return null;
    }
}
