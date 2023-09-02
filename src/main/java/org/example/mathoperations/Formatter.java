package org.example.mathoperations;

public class Formatter {
    public static String formatOperationResult(double num1, String operator, double num2, double result) {
        return String.format("%.2f %s %.2f = %.2f", num1, operator, num2, result);
    }
}
