package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.*;
import com.citi.training.FinancialDashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@RestController
@RequestMapping("/investments")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    @Autowired
    private InvestmentAccountService investmentAccountService;

    @Autowired
    private InvestmentAccountInfoService investmentAccountInfoService;

    @Autowired
    private InstrumentService instrumentService;

    // InvestmentAccount
    @RequestMapping(method = RequestMethod.GET, value = "/value/{userId}")
    public @ResponseBody Double getTotalInvestmentValueByUserId(int userId) {
        return investmentAccountService.getTotalInvestmentValueByUserId(userId);
    }

    //Investment
    @RequestMapping(method = RequestMethod.GET, value = "/{aid}")
    public Collection<Investment> getInvestment(int aid) {
        return investmentService.getInvestment(aid);
    }

    //Instrument
    @RequestMapping(method = RequestMethod.GET, value = "/instrument/{symbol}")
    public Instrument findBySymbol(String symbol) {
        return instrumentService.findBySymbol(symbol);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/instrument/{instrumentType}")
    public Collection<Instrument> findByInstrumentType(InstrumentType instrumentType) {
        return instrumentService.findByInstrumentType(instrumentType);
    }

    //InvestmentAccountInfo
    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccountInfo/{aid}")
    public InvestmentAccountInfo findByAccountId(int aid) {
        return investmentAccountInfoService.findByAccountId(aid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccountInfo/{investmentType}")
    Collection<InvestmentAccountInfo> findByInvestmentType(InvestmentType investmentType) {
        return investmentAccountInfoService.findByInvestmentType(investmentType);
    }

    @GetMapping
    public Collection<Investment> getInvestmentOverDateRange(int userId, Date start, Date end) {
        return investmentService.getInvestmentOverDateRange(userId, start, end);
    }

    @GetMapping
    public Collection<Investment> getInvestmentDetailBySymbol(int userId, String symbol) {
        return investmentService.getInvestmentDetailBySymbol(userId, symbol);
    }

    @GetMapping
    public Collection<Investment> getInvestmentDetailBySymbolInRange(int userId, String symbol, Date start, Date end) {
        return investmentService.getInvestmentDetailBySymbolInRange(userId, symbol, start, end);
    }

}
