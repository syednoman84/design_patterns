package com.solid.openclosed.abstractclassexample;

// This is good we keep adding new operation implementation
// and our calculator get extensions without modifying it main task
// that is performing calculation
public abstract class OperationAbs {
    public abstract int perform(int number1 , int number2);
}
