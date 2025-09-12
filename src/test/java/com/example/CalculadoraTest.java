package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @ParameterizedTest(name = "sumaRecursiva({0}) = {1}")
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 3",
        "3, 6",
        "5, 15",
        "10, 55",
        "20, 210",
        "7, 28"
    })
    @DisplayName("Pruebas parametrizadas de sumaRecursiva con @CsvSource")
    void testSumaRecursivaCsvSource(int input, int expected) {
        assertEquals(expected, calc.sumaRecursiva(input));
    }
}
