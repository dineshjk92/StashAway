package com.interview.stashaway.dev;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Customer {

    @NonNull private final String refCode;
    private int[] funcDeposits;

}
