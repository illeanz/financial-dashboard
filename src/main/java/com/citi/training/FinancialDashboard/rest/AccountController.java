package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import com.citi.training.FinancialDashboard.service.AccountService;
import com.citi.training.FinancialDashboard.service.BankingAccountInfoService;
import com.citi.training.FinancialDashboard.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private BankingAccountInfoService bankingAccountInfoService;

    @GetMapping
    public Collection<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{aid}")
    public Account getAccountById(@PathVariable("aid") int aid) {
        return accountService.getAccountById(aid);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Account addAccount(@RequestBody Account account) {
        return accountService.addNewAccount(account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{aid}")
    public void deleteAccountByID(@PathVariable("aid") int aid) {
        accountService.deleteAcountByID(aid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{accountType}")
    public Collection<Account> findByAccountType(String accountType) {
        return accountService.findByAccountType (accountType);
    }

    //Banking Account Info
    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccount/{aid}")
    BankingAccountInfo findByAccountId(int aid) {
        return bankingAccountInfoService.findByAccountId(aid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccount/{bankingType}")
    Collection<BankingAccountInfo> findByBankingType(BankingType bankingType) {
        return bankingAccountInfoService.findByAccountType(bankingType);
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
