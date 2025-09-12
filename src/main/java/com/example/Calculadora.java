package com.example;

public class Calculadora {

    // Factorial (recursivo)
    public long sumaRecursiva(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La suma no está definida para números negativos");
        }
        if (n == 0) {
            return 0;
        }
        return n + sumaRecursiva(n - 1);
    }


    // Método main para ejecutar ejemplos
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Factorial: 5! = " + calc.sumaRecursiva(5));
    }
}
