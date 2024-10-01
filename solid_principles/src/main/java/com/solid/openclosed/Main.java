package com.solid.openclosed;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.calculateNumber(5, 9, new AddOperation());
        System.out.println("Sum is: " + sum);

        int sub = calculator.calculateNumber(5, 9, new SubstractOperation());
        System.out.println("Subraction result is: " + sub);
    }
}
