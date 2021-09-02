package com.nisum.testproject.firsttestmockito.testClasses;

import com.nisum.testproject.firsttestmockito.classes.Calculator;
import com.nisum.testproject.firsttestmockito.classes.CalculatorService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculator {


    //    Calculator calculator = new Calculator((i, j) -> i+j);
//    CalculatorService calculatorService = mock(CalculatorService.class);
    @Mock
    CalculatorService calculatorService = mock(CalculatorService.class);

    Calculator calculator= new Calculator(calculatorService);


    @Before("test")
    public void setUp(){
    }

    @Test
    public void testAdd(){
        when(calculatorService.add(2,3)).thenReturn(5);
//        assertEquals(10, calculator.perform(2,3));
        assertEquals(5, calculatorService.add(2,3));

    }
}
