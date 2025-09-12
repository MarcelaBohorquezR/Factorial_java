package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Factorial_javaTest {

    private final Factorial_java calc = new Factorial_java();

    @ParameterizedTest(name = "calcularFactorial({0}) = {1}")
    @CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "3, 6",
        "5, 120",
        "7, 5040",
        "8, 40320"
    })
    @DisplayName("Pruebas parametrizadas de FactorialRecursivo con @CsvSource")
    void testFactorialRecursivoCsvSource(int input, int expected) {
        assertEquals(expected, calc.calcularFactorial(input));
    }
}
