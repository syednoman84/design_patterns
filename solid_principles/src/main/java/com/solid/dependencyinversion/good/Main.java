package com.solid.dependencyinversion.good;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AddOperation addOperation = new AddOperation();
        SubOperation subOperation = new SubOperation();

        int sum = calculator.calculate(2, 5, addOperation);
        int sub = calculator.calculate(2, 5, subOperation);

        System.out.println(sum);
        System.out.println(sub);

    }
}
