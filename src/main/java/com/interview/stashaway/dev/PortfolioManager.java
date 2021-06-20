package com.interview.stashaway.dev;

import java.util.Map;

public class PortfolioManager {

    public void fundAllocation(Customer customer, DepositPlan depositPlan, int depositFund) {

        Map<String, Double> fundDistributionMapper = calcFundDistribution(depositPlan);

        


    }

    public Map<String, Double> calcFundDistribution(DepositPlan depositPlan) {
        Map<String, Double> portfolios = depositPlan.getPortfolio_fund_allocation();
        double totalAllotedFund = portfolios.values().stream().mapToDouble(i->i).sum();

        /*Based on the total alloted fund, find the % of allocation for each portfolio*/
        portfolios.entrySet().stream().forEach(e->e.setValue(e.getValue()/totalAllotedFund));

        return portfolios;
    }
}
