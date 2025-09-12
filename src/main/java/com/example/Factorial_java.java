package com.example;

public class Factorial_java {

    public static double calcularFactorial(double n) {
        if (n < 0) {
            // Manejar caso de números negativos si es necesario
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return sumarMultiplicacion(n, calcularFactorial(n - 1));
    }

    public static double sumarMultiplicacion(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a + sumarMultiplicacion(a, b - 1);
    }




}
