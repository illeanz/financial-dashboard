package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.Instrument;
import com.citi.training.FinancialDashboard.entities.InstrumentType;
import com.citi.training.FinancialDashboard.repo.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InstrumentServiceImpl implements  InstrumentService{

    @Autowired
    private InstrumentRepository instrumentRepository;

    @Override
    public Instrument findBySymbol(String symbol) {
        return instrumentRepository.findBySymbol(symbol);
    }

    @Override
    public Collection<Instrument> findByInstrumentType(InstrumentType instrumentType) {
        return instrumentRepository.findByInstrumentType(instrumentType);
    }

    @Override
    public Instrument addBySymbol(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

    @Override
    public void deleteBySymbol(String symbol) {
        instrumentRepository.deleteBySymbol(symbol);
    }
}
