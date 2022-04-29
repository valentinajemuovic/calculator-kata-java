package com.optivem.kata.calculator.core;

import com.optivem.kata.calculator.core.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        this.calculator = new Calculator();
    }

    @Test
    void should_add_two_numbers() {
        var first = 2;
        var second = 3;
        var expectedResult = 5;

        var result = calculator.add(first, second);

        assertThat(result).isEqualTo(expectedResult);
    }
}
