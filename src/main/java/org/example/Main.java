package org.example;

import org.example.mathoperations.Formatter;
import org.example.mathoperations.MathUtils;

public class Main {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

        double additionResult = MathUtils.add(num1, num2);
        double subtractionResult = MathUtils.subtract(num1, num2);
        double multiplicationResult = MathUtils.multiply(num1, num2);
        double divisionResult = MathUtils.divide(num1, num2);

        System.out.println("Basic Mathematical Operations:");

        System.out.println(Formatter.formatOperationResult(num1, "+", num2, additionResult));
        System.out.println(Formatter.formatOperationResult(num1, "-", num2, subtractionResult));
        System.out.println(Formatter.formatOperationResult(num1, "*", num2, multiplicationResult));
        System.out.println(Formatter.formatOperationResult(num1, "/", num2, divisionResult));
    }
}