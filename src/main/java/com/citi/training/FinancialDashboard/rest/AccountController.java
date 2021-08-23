package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, value = "/{aid}")
    public @ResponseBody Account getAccountById(@PathVariable("aid") int aid) {
        return accountService.getAccountById(aid);
    }

//    @GetMapping
//    public Collection<Investment> getTopGainersByUserId(int userId, int index) {
//        return accountService.getTopGainersByUserId(userId);
//    }
//
//    @GetMapping
//    public Collection<Investment> getTopLosersByUserId(int userId, int index) {
//        return accountService.getTopLosersByUserId(userId);
//    }
//
//    @GetMapping
//    public Double getTotalCashValueByUserId(int userId) {
//        return accountService.getTotalCashValueByUserId(userId);
//    }
//
//    @GetMapping
//    public Collection<Investment> getIndicesUserId(int userId) {
//        return accountService.getIndicesUserId(userId);
//    }
}
