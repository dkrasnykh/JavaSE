package com.mera.training.advanced.practice11;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    interface Operation {
        Double doOperation(Double number1, Double number2) throws ArithmeticException;
    }

    public static class Calculator {
        private Map<String, Operation> operations = new HashMap<>();

        public void addOperation(String operationName, Operation implementation) {
            operations.put(operationName, implementation);
        }

        public void calculate(String operationName, Double number1, Double number2) {
            Operation operation = operations.get(operationName);
            System.out.println(operation.doOperation(number1, number2));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addOperation("sum", Double::sum);
        calc.addOperation("mult", (a, b) -> a * b);
        calc.addOperation("div", (a, b) -> a / b);
        calc.addOperation("sub", (a, b) -> a - b);
        calc.addOperation("pow", Math::pow);
        calc.addOperation("sqrt", (a, n) -> Math.pow(a, 1 / n));
        calc.calculate("sum", 2.0, 3.0);
        calc.calculate("sqrt", 8.0, 3.0);
    }
}
