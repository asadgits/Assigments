package com.nisum.testproject.firsttestmockito.classes;

public class Calculator {

    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int perform(int i , int j){
        return calculatorService.add(i,j)*i;
    }
}
