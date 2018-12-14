package main.java.eu.deltasource.calculatorservice;

import main.java.eu.deltasource.internal.SecretAlgorithms;

public class CalculatorService {


    public int sum(int a, int b) {
        return SecretAlgorithms.adder(a, b);
    }

    public int subtract(int a, int b) {
        return SecretAlgorithms.subtracter(a, b);
    }

    public int multiply(int a, int b) {
        return SecretAlgorithms.multiplier(a, b);
    }

    public int divide(int a, int b) {
        return SecretAlgorithms.divider(a, b);
    }
}
