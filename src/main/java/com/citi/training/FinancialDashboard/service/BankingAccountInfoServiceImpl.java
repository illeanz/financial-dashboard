package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.BankingAccountInfo;
import com.citi.training.FinancialDashboard.entities.BankingType;
import com.citi.training.FinancialDashboard.repo.BankingAccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class BankingAccountInfoServiceImpl implements BankingAccountInfoService{

    @Autowired
    private BankingAccountInfoRepository bankingAccountInfoRepository;

    @Override
    public BankingAccountInfo findByAccountId(int aid) {

        Optional<BankingAccountInfo> bankingAccountInfoOptional = bankingAccountInfoRepository.findById(aid);
        if (bankingAccountInfoOptional.isPresent())
            return bankingAccountInfoOptional.get();
        else
            return null;
    }

    @Override
    public Collection<BankingAccountInfo> findByAccountType(BankingType bankingType) {
        Collection<BankingAccountInfo> allbankAccInfo = bankingAccountInfoRepository.findAll();
        Collection<BankingAccountInfo> allbankAccInfoMatching = new ArrayList<>();
        for (BankingAccountInfo a : allbankAccInfo) {
            if (a.getBankingType() == bankingType)
                allbankAccInfoMatching.add(a);
        }
        return allbankAccInfoMatching;
    }
}
