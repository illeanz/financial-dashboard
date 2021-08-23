package com.citi.training.FinancialDashboard.repo;

import com.citi.training.FinancialDashboard.entities.Instrument;
import com.citi.training.FinancialDashboard.entities.InstrumentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface InstrumentRepository extends JpaRepository<Instrument, Integer> {

    Instrument findBySymbol(String symbol);

    Collection<Instrument> findByInstrumentType(InstrumentType instrumentType);
}
