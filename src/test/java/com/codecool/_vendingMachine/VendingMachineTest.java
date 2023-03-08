package com.codecool._vendingMachine;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine = new VendingMachine();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(
                        new BigDecimal("2.50"),
                        new BigDecimal("3.00"),
                        List.of(new BigDecimal("0.50"))),
                Arguments.of(
                        new BigDecimal("1.50"),
                        new BigDecimal("3.00"),
                        List.of(new BigDecimal("1.00"), new BigDecimal("0.50"))),
                Arguments.of(
                        new BigDecimal("0.40"),
                        new BigDecimal("3.00"),
                        List.of(new BigDecimal("2.00"), new BigDecimal("0.50"), new BigDecimal("0.10"))),
                Arguments.of(
                        new BigDecimal("0.80"),
                        new BigDecimal("4.00"),
                        List.of(new BigDecimal("2.00"), new BigDecimal("1.00"), new BigDecimal("0.20"))),
                Arguments.of(
                        new BigDecimal("0.10"),
                        new BigDecimal("1.00"),
                        List.of(new BigDecimal("0.50"), new BigDecimal("0.20"), new BigDecimal("0.20")))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    public void getChangeTest(BigDecimal price, BigDecimal insertedMoney, List<BigDecimal> change) {
        assertEquals(change, vendingMachine.getChange(price, insertedMoney));
    }

}
