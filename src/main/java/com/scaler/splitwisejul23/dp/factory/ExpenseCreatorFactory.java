package com.scaler.splitwisejul23.dp.factory;


import com.scaler.splitwisejul23.dp.strategy.EqualExpenseCreatorStrategy;
import com.scaler.splitwisejul23.dp.strategy.ExpenseCreatorStrategy;
import org.springframework.stereotype.Component;

import static com.scaler.splitwisejul23.util.AppConstants.EQUAL;

@Component
public class ExpenseCreatorFactory {

    private final EqualExpenseCreatorStrategy equalExpenseCreatorStrategy;

    public ExpenseCreatorFactory(EqualExpenseCreatorStrategy equalExpenseCreatorStrategy) {
        this.equalExpenseCreatorStrategy = equalExpenseCreatorStrategy;
    }

    public ExpenseCreatorStrategy getExpenseCreator(String expenseType) {

        return switch (expenseType) {
            case EQUAL -> equalExpenseCreatorStrategy;
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}
