package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;

import java.util.Collection;


public interface BankingAccountInfoService {

    BankingAccountInfo findByAccountId(int aid);

    Collection<BankingAccountInfo> findByBankingType(BankingType bankingType);

    //Collection<BankingAccountInfo> findBankingAccInfoByUserId(int userId);
}
