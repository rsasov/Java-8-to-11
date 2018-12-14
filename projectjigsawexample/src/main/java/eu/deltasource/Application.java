package main.java.eu.deltasource;

import main.java.eu.deltasource.calculators.Calculator;


public class Application {

    public static void main(String[] args) {
        System.out.println("Hello main class!");

        Calculator calculator = new Calculator();

        int sumResult = calculator.sumTwoNumbers(1, 1);
        System.out.println("1 + 1 is " + sumResult);

        int subResult = calculator.subtractTwoNumbers(6, 3);
        System.out.println("6 - 3 is " + subResult);

        int mulResult = calculator.multiplyTwoNumbers(2, 2);
        System.out.println("2 * 2 is " + mulResult);

        int divResult = calculator.divideTwoNumbers(10,2);
        System.out.println("10 / 2 is " + divResult);

        System.out.println("\nSo much modules. \nWoW!");
    }

}
