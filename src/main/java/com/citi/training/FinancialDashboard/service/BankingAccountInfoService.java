package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface BankingAccountInfoService {

    BankingAccountInfo findByAccountId(int aid);

    Collection<BankingAccountInfo> findByBankingType(BankingType bankingType);

    Collection<BankingAccountInfo> findBankingAccInfoByUserId(int userId);
}
