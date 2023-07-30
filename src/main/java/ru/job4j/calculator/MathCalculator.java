package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double allOperatins(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат 1-го расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат 2-го расчета равен: " + subAndDiv(10, 20));
        System.out.println("Результат 3-го расчета равен: " + allOperatins(10, 20));
    }
}
