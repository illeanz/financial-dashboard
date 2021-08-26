package com.citi.training.FinancialDashboard.service;

import com.citi.training.FinancialDashboard.entities.InvestmentAccountInfo;
import com.citi.training.FinancialDashboard.entities.InvestmentType;
import com.citi.training.FinancialDashboard.repo.InvestmentAccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InvestmentAccountInfoServiceImpl implements InvestmentAccountInfoService{

    @Autowired
    private InvestmentAccountInfoRepository investmentAccountInfoRepository;

    @Override
    public InvestmentAccountInfo findByAccountId(int aid) {
        return investmentAccountInfoRepository.findByAccountId(aid);
    }

    @Override
    public Collection<InvestmentAccountInfo> findByInvestmentType(InvestmentType investmentType) {
        return investmentAccountInfoRepository.findByInvestmentType(investmentType);
    }

    @Override
    public Collection<InvestmentAccountInfo> findByUserId(int userId) {
        return investmentAccountInfoRepository.findByUserId(userId);
    }

    @Override
    public InvestmentAccountInfo addInvestmentAccInfo(InvestmentAccountInfo investmentAccountInfo) {
        return investmentAccountInfoRepository.save(investmentAccountInfo);
    }

    @Override
    public void deleteInvestmentAccountInfoByAccountId(int aid) {
        investmentAccountInfoRepository.deleteById(aid);
    }
}
