package com.solid.openclosed.abstractclassexample;

// No modifications in our calculator functionality
// We can keep adding extension by create new operations
public class CalculatorAbs {
    public int calculateNumber(int number1 , int number2 , OperationAbs operation){
        return  operation.perform(number1 , number2);
    }
}
