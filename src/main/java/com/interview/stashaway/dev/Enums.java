package com.interview.stashaway.dev;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Enums{

    @AllArgsConstructor
    public enum PlanTypes {
        ONE_TIME ("OneTime"),
        MONTHLY("Monthly");

        @Getter
        private String planType;
    }

    public enum Portfolios {
        HIGH_RISK,
        RETIREMENT
    }


}
