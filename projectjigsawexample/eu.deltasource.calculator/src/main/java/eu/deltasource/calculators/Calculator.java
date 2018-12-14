package main.java.eu.deltasource.calculators;

import main.java.eu.deltasource.calculatorservice.CalculatorService;

public class Calculator {
    public CalculatorService secretCalculator = new CalculatorService();

    public int sumTwoNumbers(int a, int b) {
        return secretCalculator.sum(a, b);
    }

    public int subtractTwoNumbers(int a, int b) {
        return secretCalculator.subtract(a, b);
    }

    public int multiplyTwoNumbers(int a, int b) {
        return secretCalculator.multiply(a, b);
    }

    public int divideTwoNumbers(int a, int b) {
        return secretCalculator.divide(a, b);
    }
}
