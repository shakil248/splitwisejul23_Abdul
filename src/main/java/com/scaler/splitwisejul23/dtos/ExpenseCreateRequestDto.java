package com.scaler.splitwisejul23.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpenseCreateRequestDto {

    String expenseRule;
    Long createdBy;
    int amount;
    Long groupId;
    String description;
    String payType;
}
