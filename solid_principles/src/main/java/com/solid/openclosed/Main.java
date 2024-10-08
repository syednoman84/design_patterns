package com.solid.openclosed;

import com.solid.openclosed.abstractclassexample.AddOperationAbs;
import com.solid.openclosed.abstractclassexample.CalculatorAbs;
import com.solid.openclosed.abstractclassexample.MultOperationAbs;
import com.solid.openclosed.abstractclassexample.SubstractOperationAbs;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.calculateNumber(5, 9, new AddOperation());
        System.out.println("Sum is: " + sum);

        int sub = calculator.calculateNumber(5, 9, new SubstractOperation());
        System.out.println("Subtraction result is: " + sub);

        CalculatorAbs calculatorAbs = new CalculatorAbs();
        int sumAbs = calculatorAbs.calculateNumber(5, 9, new AddOperationAbs());
        System.out.println("Sum is: " + sumAbs);

        int subAbs = calculatorAbs.calculateNumber(5, 9, new SubstractOperationAbs());
        System.out.println("Subtraction result is: " + subAbs);

        int multAbs = calculatorAbs.calculateNumber(3, 9, new MultOperationAbs());
        System.out.println("Multiplication result is: " + multAbs);

    }
}
