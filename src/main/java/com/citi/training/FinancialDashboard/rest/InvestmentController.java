//package com.citi.training.FinancialDashboard.rest;
//
//import com.citi.training.FinancialDashboard.entities.Investment;
//import com.citi.training.FinancialDashboard.service.InvestmentService;
//import com.citi.training.FinancialDashboard.service.InvestmentServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//import java.util.Date;
//
//@RestController
//@RequestMapping("/investments")
//public class InvestmentController {
//
//    @Autowired
//    private InvestmentService investmentService;
//
//    @GetMapping
//    public int getTotalInvestmentValueByUserId(int userId) {
//        return investmentService.getTotalInvestmentValueByUserId(userId);
//    }
//
//    @GetMapping
//    public Collection<Investment> getInvestment(int userId, int accountId) {
//        return investmentService.getInvestment();
//    }
//
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
//
//}
