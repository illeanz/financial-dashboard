package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.*;
import com.citi.training.FinancialDashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@CrossOrigin
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

    //Investment-------------------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/{aid}")
    public Collection<Investment> getInvestment(@PathVariable("aid") int aid) {
        return investmentService.getInvestment(aid);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Investment addInvestment(@RequestBody Investment investment) {
        return investmentService.addInvestment(investment);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/AvgPrice/{aid}/{symbol}")
    public Investment modifyInvestmentAvgPrice(@PathVariable("aid") int aid, @PathVariable("symbol") String symbol, @RequestBody double avgPrice) {
        return investmentService.modifyInvestmentAvgPrice(aid, symbol, avgPrice);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Position/{aid}/{symbol}")
    public Investment modifyInvestmentPosition(@PathVariable("aid") int aid, @PathVariable("symbol") String symbol, @RequestBody int position) {
        return investmentService.modifyInvestmentPosition(aid, symbol, position);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteInvestment(@RequestBody Investment investment) {
        investmentService.deleteInvestment(investment);
    }

    // InvestmentAccount----------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccount/value/{userId}")
    public @ResponseBody Double getTotalInvestmentValueByUserId(@PathVariable("userId") int userId) {
        return investmentAccountService.getTotalInvestmentValueByUserId(userId);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccount/users/{userId}")
    public InvestmentAccount getInvestmentAccountByUserId(@PathVariable("userId") int userId) {
        return investmentAccountService.getInvestmentAccountByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccount/{aid}")
    public InvestmentAccount getInvestmentAccountByAccountId(@PathVariable("aid") int aid) {
        return investmentAccountService.getInvestmentAccountByAccountId(aid);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/investmentAccount")
    public InvestmentAccount addInvestmentAccount(@RequestBody InvestmentAccount investmentAccount) {
        return investmentAccountService.addInvestmentAccount(investmentAccount);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/investmentAccount/{aid}")
    public void deleteInvestmentAccountByAccountId(@PathVariable("aid") int aid) {
        investmentAccountService.deleteInvestmentAccount(aid);
    }

    //Instrument---------------------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/instrument/{symbol}")
    @ResponseBody
    public Instrument findBySymbol(@PathVariable("symbol") String symbol) {
        Instrument returnVal =  instrumentService.findBySymbol(symbol);
        return returnVal;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/instrument")
    public Instrument addBySymbol(@RequestBody Instrument instrument) {
        return instrumentService.addBySymbol(instrument);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/instrument/{symbol}")
    public void deleteBySymbol(@PathVariable("symbol") String symbol) {
        instrumentService.deleteBySymbol(symbol);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/instrument/type/{instrumentType}")
    public Collection<Instrument> findByInstrumentType(@PathVariable("instrumentType") String instrumentType) {
        return instrumentService.findByInstrumentType(instrumentType);
    }

    //InvestmentAccountInfo--------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccountInfo/{aid}")
    public InvestmentAccountInfo findInvestmentAccountInfoByAccountId(@PathVariable("aid") int aid) {
        return investmentAccountInfoService.findByAccountId(aid);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/investmentAccountInfo")
    public InvestmentAccountInfo addInvestmentAccInfo(@RequestBody InvestmentAccountInfo investmentAccountInfo) {
        return investmentAccountInfoService.addInvestmentAccInfo(investmentAccountInfo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/investmentAccountInfo/{aid}")
    public void deleteInvestmentAccountInfoByAccountId(@PathVariable("aid") int aid) {
        investmentAccountInfoService.deleteInvestmentAccountInfoByAccountId(aid);
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccountInfo/{userId}")
//    public Collection<InvestmentAccountInfo> findInvestmentAccountInfoByUserId(@PathVariable("userId") int aid) {
//        return investmentAccountInfoService.findByUserId(aid);
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/investmentAccountInfo/{investmentType}")
    Collection<InvestmentAccountInfo> findByInvestmentType(@PathVariable("investmentType") InvestmentType investmentType) {
        return investmentAccountInfoService.findByInvestmentType(investmentType);
    }

    //----------------------------------
//    @GetMapping
//    public Collection<Investment> getInvestmentOverDateRange(int userId, Date start, Date end) {
//        return investmentService.getInvestmentOverDateRange(userId, start, end);
//    }
//
//    @GetMapping
//    public Collection<Investment> getInvestmentDetailBySymbol(int userId, String symbol) {
//        return investmentService.getInvestmentDetailBySymbol(userId, symbol);
//    }
//
//    @GetMapping
//    public Collection<Investment> getInvestmentDetailBySymbolInRange(int userId, String symbol, Date start, Date end) {
//        return investmentService.getInvestmentDetailBySymbolInRange(userId, symbol, start, end);
//    }

}
