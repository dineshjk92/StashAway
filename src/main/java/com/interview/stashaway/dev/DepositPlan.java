package com.interview.stashaway.dev;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class DepositPlan {

    private String planType;
    private Map<String, Double> portfolio_fund_allocation;

    @Override
    public String toString() {
        return "This deposit plan is a " + planType + " plan";
    }

}
