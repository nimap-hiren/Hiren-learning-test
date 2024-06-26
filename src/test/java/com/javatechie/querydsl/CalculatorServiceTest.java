package com.javatechie.querydsl;

import com.javatechie.querydsl.Junit.CalculatorService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
