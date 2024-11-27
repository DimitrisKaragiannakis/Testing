package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(14, calculator.add(9, 5), "9 + 5 should equal 14");
        assertEquals(0, calculator.add(-1, 1), "-1+1 should equal 0");
    }

    @Test
    @DisplayName("Substract two numbers")
    void subtract() {
        assertEquals(3, calculator.subtract(5, 2), "5 - 2 should equal 3");
        assertEquals(-2, calculator.subtract(-1, 1), "-1 - 1 should equal -2");
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertEquals(9, calculator.multiply(3, 3), "3 * 3 should equal 6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        assertEquals(4, calculator.divide(8, 2), "8 / 2 should equal 4");
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Division by zero should throw ArithmeticException");
    }
}