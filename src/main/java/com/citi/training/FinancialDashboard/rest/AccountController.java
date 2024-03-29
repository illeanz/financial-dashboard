package com.citi.training.FinancialDashboard.rest;

import com.citi.training.FinancialDashboard.entities.Account;
import com.citi.training.FinancialDashboard.entities.BankingAccount;
import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import com.citi.training.FinancialDashboard.service.AccountService;
import com.citi.training.FinancialDashboard.service.BankingAccountInfoService;
import com.citi.training.FinancialDashboard.service.BankingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private BankingAccountInfoService bankingAccountInfoService;

    @Autowired
    private BankingAccountService bankingAccountService;

    @GetMapping
    public Collection<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/aid/{aid}")
    public Account getAccountById(@PathVariable("aid") int aid) {
        return accountService.getAccountById(aid);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Account addAccount(@RequestBody Account account) {
        return accountService.addNewAccount(account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{aid}")
    public void deleteAccountByID(@PathVariable("aid") int aid) {
        accountService.deleteAccountByID(aid);
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/{accountType}")
//    public Collection<Account> findByAccountType(@PathVariable("accountType") String accountType) {
//        return accountService.findByAccountType (accountType);
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/uid/{userId}")
    public Iterable<Account> findAccountByUserId(@PathVariable("userId") int userId) {
        return accountService.findByUserId (userId);
    }

    //Banking Account Info----------------------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccountInfo/{aid}")
    public BankingAccountInfo findBankingAccountInfoByAccountId(@PathVariable("aid") int aid) {
        return bankingAccountInfoService.findByAccountId(aid);
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccountInfo/{userId}")
//    public Collection<BankingAccountInfo> findBankingAccountInfoByUserId(@PathVariable("userId") int userId) {
//        return bankingAccountInfoService.findBankingAccInfoByUserId(userId);
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccountInfo/{bankingType}")
    public Collection<BankingAccountInfo> findBankingAccountInfoByBankingType(@PathVariable("bankingType") BankingType bankingType) {
        return bankingAccountInfoService.findByBankingType(bankingType);
    }

    //Banking Account ----------------------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccount")
    public Collection<BankingAccount> findBankingAccountAll() {
        return bankingAccountService.findBankingAccountAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bankingAccount/{userId}")
    public Collection<BankingAccount> findBankingAccountByUserId(@PathVariable("userId") int userId) {
        return bankingAccountService.findBankingAccountByUserId(userId);
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
