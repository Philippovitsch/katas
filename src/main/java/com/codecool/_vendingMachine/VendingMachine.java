package com.codecool._vendingMachine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    // self-made example

    private final BigDecimal[] coins = {
            new BigDecimal("2.00"),
            new BigDecimal("1.00"),
            new BigDecimal("0.50"),
            new BigDecimal("0.20"),
            new BigDecimal("0.10"),
            new BigDecimal("0.05"),
            new BigDecimal("0.02"),
            new BigDecimal("0.01")
    };

    public List<BigDecimal> getChange(BigDecimal price, BigDecimal insertedMoney) {
        List<BigDecimal> change = new ArrayList<>();
        while (insertedMoney.compareTo(price) > 0) {
            BigDecimal coin = calculateChange(price, insertedMoney);
            change.add(coin);
            insertedMoney = insertedMoney.subtract(coin);
        }
        return change;
    }

    private BigDecimal calculateChange(BigDecimal price, BigDecimal insertedMoney) {
        for (BigDecimal coin : coins) {
            if (insertedMoney.subtract(coin).compareTo(price) >= 0) {
                return coin;
            }
        }
        return new BigDecimal("0");
    }

}
