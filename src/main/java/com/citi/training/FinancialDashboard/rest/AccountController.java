package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.Investment;
import com.citi.training.FinancialDashboard.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public Collection<Investment> getTopGainersByUserId(int userId, int index) {
        return accountService.getTopGainersByUserId(userId);
    }

    @GetMapping
    public Collection<Investment> getTopLosersByUserId(int userId, int index) {
        return accountService.getTopLosersByUserId(userId);
    }

    @GetMapping
    public Double getTotalCashValueByUserId(int userId) {
        return accountService.getTotalCashValueByUserId(userId);
    }

    @GetMapping
    public Collection<Investment> getIndicesUserId(int userId) {
        return accountService.getIndicesUserId(userId);
    }
}
