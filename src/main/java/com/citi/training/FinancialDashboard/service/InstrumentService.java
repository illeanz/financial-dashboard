package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Instrument;
import com.citi.training.FinancialDashboard.entities.InstrumentType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service 
public interface InstrumentService {
    Instrument findBySymbol(String symbol);

    Collection<Instrument> findByInstrumentType(InstrumentType instrumentType);
}
